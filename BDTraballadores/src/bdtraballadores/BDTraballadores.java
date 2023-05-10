package bdtraballadores;

import java.util.ArrayList;

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
        
        ArrayList<Empregado> empregados = dao.getEmpregados();
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }

}
