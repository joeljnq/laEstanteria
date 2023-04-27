/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
public class Almacenamiento extends Producto{
    
    private double tamaño;
    private String Marca;
    private int velocidad;

    public Almacenamiento(double tamaño, String Marca, int velocidad, String tipo, String nombre, int id, int stock) {
        super(tipo, nombre, id, stock);
        this.tamaño = tamaño;
        this.Marca = Marca;
        this.velocidad = velocidad;
    }
    
  
    
    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    
}
