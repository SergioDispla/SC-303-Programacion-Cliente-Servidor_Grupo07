/**
 *
 * @author 
 */
package Gestores;
import Facturacion.Facturacion;
import Taller.*;
import Personas.*;
import java.util.ArrayList;


public class GestorAdministracionProductos implements Facturacion {
    private float totalPagado;
    
    ArrayList<Producto> productos = new ArrayList<>();   
    ArrayList<String> ventas = new ArrayList<>();
    
    
    //Metodo praa insertar productos
    public void ingresarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void listarProductos(){
        for (Producto producto : productos){
            producto.informacionProductos();
        }
    }

    @Override
    public void registroCompras(Cliente cedulaCliente, float totalPagado, TipoPago tipoPago) {
        ventas.add("Numero de Compra #" + (ventas.size()+1) + " - Cliente: " + cedulaCliente.getNombre()  + ", Total Pagado: c"  + totalPagado + ", Tipo de Pago: " + tipoPago);   
    }

    @Override
    public void listarCompras() {
        System.out.println("Listado de compras: ");
        for (String venta : ventas){
            System.out.println(venta);
        }

    }
    
}
