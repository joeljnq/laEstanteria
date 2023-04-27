package laestanteria;

/**
 *
 * @author a22davidma
 */
public class almacen {
    
    private String nombre;
    private String seccion;

    public almacen(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public void consultarPrecio(String subTipo, String marca){
        
    }
    
    public void consultarStock(String subTipo, String marca) {
        
    }
    
}
