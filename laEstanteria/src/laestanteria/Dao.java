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

/**
 *
 * @author a18jaimejnq
 */
public class Dao {

    private String usuario;
    private String contraseña;
    private String cadenaConexion;

    public Dao(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        cadenaConexion = "jdbc:mysql://192.168.109.24:3306/laestanteria";
    }

    public Dao() {
        cadenaConexion = "jdbc:mysql://192.168.109.24:3306/laestanteria";
    }

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
                insertar.setString(5, cliente.getContraseña());
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

    public boolean comprobarUsuario(String nombre, String contraseña) {  //ESTE METODO SIRVE PARA COMPROBAR SI EL USUARIO QUE SE HACE LOG IN SE ENCUENTRA EN LA BASE DE DATOS

        String comprobarNombre = "SELECT count(nombre) FROM usuario where nombre = (?) && contraseña = (?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(comprobarNombre);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
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

    public ArrayList productoPrecioAlmacenamiento(TipoProducto tipo) {  //ESTE METODO SIRVE PARA COGER TODO LOS PRECIOS DE LA TABLA PRODUCTO
        ArrayList<Object> lista = new ArrayList<>();
        String consulta = "SELECT nombre,precio FROM producto where tipo=(?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root");  PreparedStatement ps = conexion.prepareStatement(consulta);) {
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");

                lista.add(new Object[]{nombre, precio});
            }
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }

    public ArrayList productoTelefonos(TipoProducto tipo) {  //ESTE METODO SIRVE PARA COGER TODO LOS PRECIOS DE LA TABLA PRODUCTO
        ArrayList<Object> lista = new ArrayList<>();
        String consulta = "SELECT nombre,precio FROM producto where tipo=(?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");

                lista.add(new Object[]{nombre, precio});
            }
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }

    public ArrayList productosComponentes(TipoProducto tipo) {
        ArrayList<Object> lista = new ArrayList<>();
        String consulta = "SELECT nombre,precio FROM producto WHERE tipo=(?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                lista.add(new Object[]{nombre, precio});
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }

    public ArrayList productosPc(TipoProducto tipo) {
        ArrayList<Object> lista = new ArrayList<>();
        String consulta = "SELECT nombre,precio FROM producto WHERE tipo=(?)";

        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, tipo.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                lista.add(new Object[]{nombre, precio});
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }
    public ArrayList consultarPedidos(){
        ArrayList<Object> lista = new ArrayList<>();
        String consulta ="SELECT idPedido, factura, estado FROM pedido WHERE idPedido= any(SELECT idPedido FROM usuario)";
        try ( Connection conexion = DriverManager.getConnection(cadenaConexion, "estanteria", "root")) {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                lista.add(new Object[]{nombre, precio});
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return lista;
    }
    
    
    
    
    
    
    
    
    
    

}
