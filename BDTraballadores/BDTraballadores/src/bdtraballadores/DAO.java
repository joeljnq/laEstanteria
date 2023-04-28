package bdtraballadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
