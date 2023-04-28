package bdtraballadores;

import java.sql.*;

/**
 *
 * @author marta
 */
public class BDTraballadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAO dao = new DAO("localhost", 3306, "traballadores", "root", "renaido");
        System.out.println(dao.deleteDepartment(100));
        
        
    }

}
