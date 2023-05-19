package laestanteria;

import java.util.Scanner;

/**
 *
 * @author a22davidma
 */
public class antiexception {

    
    public void error(){
    Scanner teclado = new Scanner(System.in, "ISO-8859-1");
    boolean numCorrecto = false;
    while (!numCorrecto){
            try {
            //escribir el valor
            //A partir de aquí se ejecuta solo si no da error, si no,  en cuanto de error salta al catch
            numCorrecto = true;
        } catch (Exception e) {//Si se pone solo Exception te recoje cualquier excepción
            //Si hay varios catch, en cuanto se ejecuta una, las otras no saltan, para meter varios catch, consultar el zeal con lo q veas(en este caso, nextInt)
            System.out.println("Poner mensaje de error");
            teclado.nextLine();
            System.out.println(e.toString());//Captura la info de ese error
        }
    }
    }
}
