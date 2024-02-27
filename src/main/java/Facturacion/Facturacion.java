/**
 *
 * @author 
 */
package Facturacion;
import Personas.*;

public interface Facturacion {
    public enum TipoPago {
        TARJETA, EFECTIVO
    }
    void registroCompras(Cliente cedulaCliente,float totalPagado, TipoPago tipoPago);
    void listarCompras();
    
}
