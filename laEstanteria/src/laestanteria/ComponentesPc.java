/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
public class ComponentesPc extends Producto{
    
   private double tamaño;
   private String marca;
   private String subTipo;
   private double velocidad;
    
    public ComponentesPc(String tipo, String nombre, int id, int stock) {
        super(tipo, nombre, id, stock);
    }

    public ComponentesPc(double tamaño, String marca, String subTipo, double velocidad, String tipo, String nombre, int id, int stock) {
        super(tipo, nombre, id, stock);
        this.tamaño = tamaño;
        this.marca = marca;
        this.subTipo = subTipo;
        this.velocidad = velocidad;
    }
    
  

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }
    
    
    
}