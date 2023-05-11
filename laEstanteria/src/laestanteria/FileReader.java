package laestanteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a18jaimejnq
 */
public class FileReader {

    public void pedido() {
        File f = new File("fichero.txt");
        String cadena;
        try ( FileInputStream fis = new FileInputStream(f);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //"ISO-8859-1"
                  BufferedReader bfr = new BufferedReader(isr)) {
            while ((cadena = bfr.readLine()) != null) //tratamiento, por ejemplo: System.out.println(cadena);
            {
                /*
                Implementar la cadena a la interfaz de historial de pedidos
                */
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
    }
}
