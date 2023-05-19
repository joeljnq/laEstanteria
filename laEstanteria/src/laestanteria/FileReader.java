package laestanteria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a18jaimejnq
 * @author a22davidma
 * @author a18miguelamc
 */
public class FileReader {

    public void pasarcesta() {
        File f = new File("pasarcesta.txt");
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

    public void imprimircesta() {
        try ( FileOutputStream fos = new FileOutputStream("imprimircesta.txt", true);  OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); //"ISO-8859-1"
                  BufferedWriter bfw = new BufferedWriter(osw)) {
            bfw.write("Esto es una prueba");// Ejemplo
            /*
            Pasarle los valores del pedido
            */
            bfw.newLine();
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }
}
