/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a18jaimejnq
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String correo;
    private String contraseña;
    private String pago;
    private TipoCliente tipoCliente;

    public Cliente(String dni, String nombre, String correo, String contraseña) {
        this.dni = dni;      
        this.nombre = nombre;
        if (correo.contains("@")) {
                this.correo = correo;
        }else{
            System.out.println("CORREO NO VALIDO!!!!!HDP");
        }
        this.pago = " ";
        this.contraseña = contraseña;
        
        this.tipoCliente= tipoCliente.usuario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPago() {
        return pago;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

  
    
 
    
    
    public void hacerPedido(){
        
    }
    
    public void cancelarPedido(){
        
    }
    
    public void consutlarStock(){
        
    }
    
    public void estadoPedido(){
        
    }
        
   
    
}
