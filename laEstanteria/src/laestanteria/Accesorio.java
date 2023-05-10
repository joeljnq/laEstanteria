/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
public class Accesorio extends Producto{
    
    private String marca;
    private int velocidad;
    private String subTipo;

    public Accesorio(String marca, int velocidad, String subTipo, TipoProducto tipo, String nombre, int id, int stock) {
        super(tipo, nombre, id, stock);
        this.marca = marca;
        this.velocidad = velocidad;
        this.subTipo = subTipo;
    }


    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getSubTipo() {
        return subTipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setSubTipo(String subTipo) {
        this.subTipo = subTipo;
    }
    
  
    
    
    
    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    
    
}
