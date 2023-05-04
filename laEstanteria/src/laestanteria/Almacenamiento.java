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
    private int pruebA;
    
    private double tamaño;
    private String Marca;
    private int velocidad;

    public Almacenamiento(int pruebA, double tamaño, String Marca, int velocidad, TipoProducto tipo, String nombre, int id, int stock) {
        super(tipo, nombre, id, stock);
        this.pruebA = pruebA;
        this.tamaño = tamaño;
        this.Marca = Marca;
        this.velocidad = velocidad;
    }



    public double getTamaño() {
        return tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
  
    
    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    
}
