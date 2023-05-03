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
    private int saldoTarjeta;
    private char tipoCliente;

    public Cliente(String dni, String nombre, String correo, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
       
          String consulta = "CREATE USER "+dni+"@'localhost' IDENTIFIED BY "+contraseña;
        try ( Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/traballadores", "root", "ciff2Oc-"); 
                PreparedStatement ps = conexion.prepareStatement(consulta)) {
         
            
            System.out.println("Conexion OK");
            
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode() + "\n"
                    + "SLQState: " + e.getSQLState() + "\n"
                    + "Mensaje: " + e.getMessage() + "\n");
        }
        
    }
    
    

    public Cliente(String dni, String nombre, int saldoTarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldoTarjeta = saldoTarjeta;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldoTarjeta(int saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
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
