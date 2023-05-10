package bdtraballadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author marta
 */
public class DAO {
    private String server;
    private int port;
    private String dbName;
    private String dbUser;
    private String dbPassword;
    private String cadeaConexion;

    public DAO(String server, int port, String dbName, String dbUser, String dbPassword) {
        this.server = server;
        this.port = port;
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        cadeaConexion = String.format("jdbc:mysql://%s:%d/%s", server, port, dbName);
    }
    
    public boolean deleteDepartment(int code) {
        String sentencia = "DELETE FROM departamento WHERE depNumero=100";
        try (Connection conexion = DriverManager.getConnection(
                cadeaConexion, dbUser, dbPassword);
                PreparedStatement ps = conexion.prepareStatement(sentencia)) {
                int filasBorradas = ps.executeUpdate(sentencia);
                return filasBorradas == 1;
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Empregado> getEmpregados() {
        ArrayList<Empregado> empregados = new ArrayList<>();
        
        String query = "SELECT empNumero, empNome, empDataNacemento FROM empregado";
        try (Connection conexion = DriverManager.getConnection(
                cadeaConexion, dbUser, dbPassword);
                PreparedStatement ps = conexion.prepareStatement(query)) {
                ResultSet result = ps.executeQuery();
                while (result.next()) {
                    int number = result.getInt(1);
                    String name = result.getString(2);
                    LocalDate birthDate = LocalDate.parse(result.getString(3));
                    Empregado e = new Empregado(number, name, birthDate);
                    empregados.add(e);
                }
                return empregados;
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
            return null;
        }
    }
}
