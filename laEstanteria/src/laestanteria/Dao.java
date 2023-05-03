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

/**
 *
 * @author a18jaimejnq
 */
public class Dao {

    private String usuario;
    private String contraseña;
    private String cadeaConexion;

    public Dao(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        
         
    }

    public boolean crearUsuario() {
        boolean toret = false;
        String consulta = "CREATE USER ?@'localhost' IDENTIFIED BY ?";
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/laestanteria", "root",
                "ciff2Oc-");  PreparedStatement ps
                = conexion.prepareStatement(consulta)) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet resultado = ps.executeQuery();

            resultado.next();
            System.out.println("Conexion OK");
            toret = true;
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        return toret;
    }
}
