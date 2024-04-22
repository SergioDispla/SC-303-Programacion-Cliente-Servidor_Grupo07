/**
 * Inteface que define los metodos para la facturacion del taller
 */
package Factura;


public interface Factura {
    
    //Lista tipo enum para definir el tipo de pago
    public enum TipoPago {
        TARJETA, EFECTIVO
    }
    
    //Metodo para registra las compras
    void registroVentas(String cedula, float totalPagado, TipoPago tipoPago);
    
    //Metodo para listar las compras
    void listarVentas();
    
}
