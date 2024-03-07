/**
* Clase Hija - hereda los metodos de registroCompras y listarCompras de la interface Factura
* Clase para la administracion de los productos que se venderan en el taller.
* 
* Esta clase incluye: 
* - Registro de Productos 
* - Registro de la compra realizada
* - Listado de la compra realizada
 */
package Gestores;
import Producto.Producto;
import Persona.Cliente;
import Factura.Factura;
import java.util.ArrayList;


public class GestorAdministracionProductos implements Factura {
    
    //Atributo unico de la clase GestorAdministracionProductos
    private float totalPagado;
    
    //ArrayList para almacenar los productos
    ArrayList<Producto> productos = new ArrayList<>();   
    
    //ArrayList para almacenar las ventas
    ArrayList<String> ventasProductos = new ArrayList<>();
    
    //Metodo para registrar productos
    public void ingresarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void listarProductos(){
        for (Producto producto : productos){
            producto.informacionProductos();
        }
    }

    
    //Metodo sobreescrito de la interface factura - Registra la compra en el arraylist
    @Override
    public void registroCompras(Cliente cedulaCliente, float totalPagado, TipoPago tipoPago) {
        ventasProductos.add("Numero de Compra #" + (ventasProductos.size()+1) + " - Cliente: " + 
                cedulaCliente.getNombre()  + ", Total Pagado: c" + totalPagado +
                ", Tipo de Pago: " + tipoPago);   
    }

    //Metodo sobreescrito de la interface factura - Lista la compra del arraylist
    @Override
    public void listarCompras() {
        System.out.println("Listado de compras: ");
        for (String venta : ventasProductos){
            System.out.println(venta);
        }

    }
    
}
