/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
abstract class Producto {
    
    private String tipo;
    private String nombre;
    private int id;
    private int stock;

    public Producto(String tipo, String nombre, int id, int stock) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
    }
    
    
    
    

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    public int calcularPrecio(){
        int toret = 0;
        return toret;
    }
    
    
    
    
}