/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laestanteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author a18jaimejnq
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String correo;
    private String contraseña;
    private int pago;
    private TipoCliente tipoCliente;

    public Cliente(String dni, String nombre, String correo, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;  
        this.tipoCliente= tipoCliente.usuario;
    }
    
    

    public Cliente(String dni, String nombre, int saldoTarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.pago = saldoTarjeta;
    }

    public Cliente(String dni, String nombre, String correo, String contraseña, int pago, TipoCliente tipoCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.pago = pago;
        this.tipoCliente = tipoCliente;
    }
    
    
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPago() {
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

    public void setPago(int pago) {
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
