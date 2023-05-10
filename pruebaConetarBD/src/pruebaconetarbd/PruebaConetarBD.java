/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaconetarbd;

import java.sql.*;

/**
 *
 * @author a18jaimejnq
 */
public class PruebaConetarBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conexion y consulta
        String consulta = "SELECT depNumero, depNome FROM departamento";
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/traballadores", "root", "ciff2Oc-"); 
                PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ResultSet resultado = ps.executeQuery();
            System.out.println("Conexion OK");
            while (resultado.next()) {
                System.out.println("Numero: " + resultado.getInt(1));
                System.out.println("Departamento " + resultado.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }

        /*conexion y eliminacion*/
        String sentencia = "DELETE FROM departamento WHERE depNumero = 100";
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/traballadores", "root", "ciff2Oc-");  
                PreparedStatement ps = conexion.prepareStatement(sentencia)) {
            int filasBorradas = ps.executeUpdate(sentencia);
            System.out.println("Conexion OK");
            System.out.println("Filas borradas"+ filasBorradas);
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }

    }

}
