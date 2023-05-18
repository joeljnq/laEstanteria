/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
/**
 *
 * @author a18jaimejnq
 */
public class Dao {

  
    private String cadenaConexion; //este es un atributo para no modificar la conexion


    public Dao() {
        cadenaConexion = "jdbc:mysql://localhost:3306/laestanteria";
    }
/**
 * es un metodo apra poder crear un usuario metiendo un Cliente de tipo cliente como parametro
 * @param cliente
 * @return Retorna un booleano para que pueda ser impletmentado en l clase main
 */
    public boolean crearUsuario(Cliente cliente) { //ESTE METODO CREA UN USUARIO.
        boolean toret = false;

        String consulta = "INSERT INTO USUARIO(dni,nombre,pago,tipo,contraseña,correo)VALUES (?,?,?,?,?,?)";
        String comprobarNombre = "SELECT count(nombre) FROM usuario where nombre = (?)";     
        try ( Connection conexion = DriverManager.getConnection(
                cadenaConexion, "estanteria",
                "root")) {
            PreparedStatement ps
                    = conexion.prepareStatement(comprobarNombre);
            ps.setString(1, cliente.getNombre());
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));

            if (rs.getInt(1) == 0) {
                PreparedStatement insertar = conexion.prepareStatement(consulta);
                insertar.setString(1, cliente.getDni());
                insertar.setString(2, cliente.getNombre());
                insertar.setString(3, cliente.getPago());
                insertar.setString(4, cliente.getTipoCliente().toString());
                insertar.setString(5, calcularHash(cliente.getContraseña()));
                insertar.setString(6, cliente.getCorreo());
                insertar.executeUpdate();
                toret = true;
            } else {
                System.out.println("EL USUARIO YA EXISTE");
            }

            System.out.println("Conexion OK");

        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return toret;
    }
    
     private String calcularHash(String password) {
        byte[] salt = "DAW1".getBytes(StandardCharsets.UTF_8);
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 1000, 512);
        SecretKeyFactory factory;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            byte[] hash = factory.generateSecret(spec).getEncoded();
            // Conversión a cadena hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Non existe o algoritmo");
        } catch (InvalidKeySpecException e) {
            System.out.println("Erro coa clave");
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * comprueba si el usuario se encuentra en la base de datos
     * @param nombre
     * @param contraseña
     * @return un booleano para poder mostrar mensaje de errores en caso de que sea false 
     */

    public boolean comprobarUsuario(String nombre, String contraseña) { 
        

        String comprobarNombre = "SELECT count(nombre) FROM usuario where nombre = (?) && contraseña = (?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(comprobarNombre);
            ps.setString(1, nombre);
            ps.setString(2, calcularHash(contraseña));
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return false;
    }

    
/**
 * Muestra la lista de productos que hay segun el tipo de producto
 * @param tipo
 * @return un arrayList de Object para que pueda ser ingresado en la jTable
 */
    
    public ArrayList productosComponentes(TipoProducto tipo) {
        ArrayList<Object> lista = new ArrayList<>();
        String consulta = "SELECT nombre,idProducto,precio FROM producto WHERE tipo=(?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int idProducto = rs.getInt("idProducto");
                lista.add(new Object[]{nombre,idProducto, precio});
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }

    /**
     * 
     * @param nombreUsuario
     * @return 
     */
    public ArrayList consultarPedidos(String nombreUsuario){
        ArrayList<Object> lista = new ArrayList<>();
        String consulta ="SELECT idPedido, factura, estado FROM pedido WHERE idPedido=(SELECT idPedido FROM usuario WHERE nombre =(?))";
        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root");) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();      
            while (rs.next()) {
                String nombre = rs.getString("idPedido");
                double precio = rs.getInt("factura");
                String estado = rs.getString("estado");
                lista.add(new Object[]{nombre, precio,estado});
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }
    
    public String[] infoCuenta(String nombreUsuario){
        String[]toret = new String[3];
        String consultaNombre = "SELECT nombre FROM usuario WHERE nombre=(?)";
        String consultaGmail = "SELECT correo FROM usuario WHERE nombre=(?)";
        String consultaDni = "SELECT dni FROM usuario WHERE nombre=(?)";
        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root");) {
            PreparedStatement psNombre = conexion.prepareStatement(consultaNombre);
            psNombre.setString(1, nombreUsuario);
            ResultSet rsNombre = psNombre.executeQuery();
            while(rsNombre.next()){
                toret[0]= rsNombre.getString("nombre");
            }
            PreparedStatement psGmail = conexion.prepareStatement(consultaGmail);
            psGmail.setString(1, nombreUsuario);
            ResultSet rsGmail = psGmail.executeQuery();
            while(rsGmail.next()){
                toret[1]= rsGmail.getString("correo");
            }
            PreparedStatement psDni = conexion.prepareStatement(consultaDni);
            psDni.setString(1,nombreUsuario);
            ResultSet rsDni = psDni.executeQuery();
            while(rsDni.next()){
                toret[2] = rsDni.getString("dni");
            }
           
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return toret;
    }
    
    public void añadirCesta(String usuario,int cantidad,int producto){
        String consulta = "insert into cesta(producto,cantidad,usuario) values(?,?,?);";
        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root"); PreparedStatement ps = conexion.prepareStatement(consulta);){
            ps.setInt(1, producto);
            ps.setInt(2, cantidad);
            ps.setString(3, usuario);
            ps.executeUpdate();
        } catch (SQLException e) {
             System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
 
        
    }
    public String obtenerDniUsuario(String usuario){
        String toret="";
        String consulta = "SELECT dni FROM usuario WHERE nombre = ?";
        
        try(Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root"); PreparedStatement ps = conexion.prepareStatement(consulta);) {
            ps.setString(1, usuario);
          
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                toret = rs.getString(1);
            }
        } catch (SQLException e) {
               System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
       
        return toret;
    }
    public ArrayList mostrarUltimaCesta(String dni){
        String consulta ="select pr.idProducto,pr.precio from producto as pr join cesta as ces on(pr.idProducto= ces.producto) where ces.usuario = ? order by ces.idCesta desc limit 1;";
       ArrayList<Object> lista = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root");PreparedStatement ps = conexion.prepareStatement(consulta);){
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int producto = rs.getInt("idProducto");
                double precio = rs.getDouble("precio");
                lista.add(new Object[]{producto,precio});
            }
            
        } catch (SQLException e) {
              System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
        }

    
}