package laestanteria;

import java.time.LocalDate;

/**
 *
 * @author a22davidma
 */
public class gestor {
    private boolean estadoPedido;
    private LocalDate FechaFactura;
    private LocalDate FechaInicioPedido;
    private LocalDate FechaEntregaPedido;
    private boolean pedidoActivo;

    public gestor(boolean estadoPedido, LocalDate FechaFactura, LocalDate FechaInicioPedido, LocalDate FechaEntregaPedido, boolean pedidoActivo) {
        this.estadoPedido = estadoPedido;
        this.FechaFactura = FechaFactura;
        this.FechaInicioPedido = FechaInicioPedido;
        this.FechaEntregaPedido = FechaEntregaPedido;
        this.pedidoActivo = pedidoActivo;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public LocalDate getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(LocalDate FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public LocalDate getFechaInicioPedido() {
        return FechaInicioPedido;
    }

    public void setFechaInicioPedido(LocalDate FechaInicioPedido) {
        this.FechaInicioPedido = FechaInicioPedido;
    }

    public LocalDate getFechaEntregaPedido() {
        return FechaEntregaPedido;
    }

    public void setFechaEntregaPedido(LocalDate FechaEntregaPedido) {
        this.FechaEntregaPedido = FechaEntregaPedido;
    }

    public boolean isPedidoActivo() {
        return pedidoActivo;
    }

    public void setPedidoActivo(boolean pedidoActivo) {
        this.pedidoActivo = pedidoActivo;
    }
    
    
    
    public void generarFactura(){
        
    }
    
    public void modificarStock(){
        
    }
    
    public void hacerPedido(){
        
    }
    
    public void cubrirPedido(){
        
    }
}

