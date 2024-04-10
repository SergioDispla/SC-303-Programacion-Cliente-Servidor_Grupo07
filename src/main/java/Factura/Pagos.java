/*
Clase para mapear los tipo de pagos que estan en los comboBox a objetos TipoPago
*/
package Factura;

import Factura.Factura.TipoPago;

public class Pagos { 
    TipoPago tipoPago;
    //Metodo para poder mapear el item seleccionado en el combo box
    public TipoPago mapearTipoPago(String comboBoxItemPago){
        if (comboBoxItemPago == "TARJETA") {
            tipoPago = TipoPago.TARJETA;
        } else if (comboBoxItemPago == "EFECTIVO") {
            tipoPago = TipoPago.EFECTIVO;
        } else {
            tipoPago = null;
        }
        return tipoPago;
    }
}
