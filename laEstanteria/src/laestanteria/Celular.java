/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
public class Celular extends Producto {
    
    private double tamaño;
    private String marca;
    private String subTipo;
    private double velocidad;

    public Celular(double tamaño, String marca, String subTipo, double velocidad, TipoProducto tipo, String nombre, int id, int stock) {
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
