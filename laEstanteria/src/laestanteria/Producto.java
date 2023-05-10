/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
class Producto {
    
    private TipoProducto tipo;
    private String nombre;
    private int id;
    private int stock;

    public Producto(TipoProducto tipo, String nombre, int id, int stock) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
    }

    public Producto() {
    }
    
    

    public TipoProducto getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
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
