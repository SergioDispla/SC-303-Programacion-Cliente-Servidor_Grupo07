/**
 *
 * @author 
 */
package Factura;
import Persona.Cliente;

public interface Factura {
    public enum TipoPago {
        TARJETA, EFECTIVO
    }
    void registroCompras(Cliente cedulaCliente,float totalPagado, TipoPago tipoPago);
    void listarCompras();
    
}
