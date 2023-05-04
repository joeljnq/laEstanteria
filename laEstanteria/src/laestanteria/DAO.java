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

    public Dao(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        
         
    }

    public boolean crearUsuario(Cliente cliente) {
        boolean toret = false;
           
        String consulta = "INSERT INTO USUARIO(dni,nombre,pago,tipo,contraseña)VALUES (?,?,?,?,?)";
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/laestanteria", "root",
                "abc123.");  PreparedStatement ps
                = conexion.prepareStatement(consulta)) {
            ps.setString(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getPago());
            ps.setString(4, cliente.getTipoCliente().toString());
            ps.setString(5, cliente.getContraseña());
            ps.executeUpdate();
           
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
