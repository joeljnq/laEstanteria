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

    public Dao(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Dao() {
    }
    

    public boolean crearUsuario(Cliente cliente) {
        boolean toret = false;

        String consulta = "INSERT INTO USUARIO(dni,nombre,pago,tipo,contraseña,correo)VALUES (?,?,?,?,?,?)";
        String comprobarNombre = "SELECT count(nombre) FROM usuario where nombre = (?)";
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/laestanteria", "root",
                "abc123.")) {
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

    public boolean comprobarUsuario(String nombre, String contraseña) {
        boolean toret = false;
        String comprobarNombre = "SELECT count(nombre) FROM usuario where nombre = (?) && contraseña = (?)";
      
        try ( Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/laestanteria", "root", "abc123.")) {
            PreparedStatement ps = conexion.prepareStatement(comprobarNombre);
            ps.setString(1,nombre);
            ps.setString(2, contraseña);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1)>0){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean productoAlmacenamiento(TipoProducto tipo){
        boolean toret = false;
        ArrayList<Producto> lista = new ArrayList<>();
        String consulta= "SELECT * FROM producto";
        
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/laestanteria", "root", "abc123.")){
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
            }
            
        } catch (Exception e) {
        }
        return toret;
    }
    
    
    
}
