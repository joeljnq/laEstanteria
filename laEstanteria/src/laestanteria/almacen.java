package laestanteria;

/**
 *
 * @author a18jaimejnq
 * @author a22davidma
 * @author a18miguelamc
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
    
    public double consultarPrecio(String subTipo, String marca){
        return 1;
    }
    
    public int consultarStock(String subTipo, String marca) {
        return 1;
    }
    
}
