
package Taller;
import Producto.Producto;
import Persona.Cliente;
import Factura.Factura.*;
import static Factura.Factura.TipoPago.*;
import java.time.LocalDate;
import Gestores.*;
import Persona.Persona.*;

public class Taller {

    public static void main(String[] args) {
        
        
        //String cedula, String nombre, String telefono, 
         //   String direccion, String correoElectronico, roles rolUsuario, 
         //   String placaVehiculo, LocalDate fechaRegistro///  
        
        Cliente cliente01 = new Cliente("116110238","Sergio Monge Solorzano","89898989","Heredia","sams29@hotmail.es",Roles.Cliente,"BRH-324",LocalDate.of(2024, 2, 24));
        Cliente cliente02 = new Cliente("111111111","Alonso Monge Solorzano","89898989","Heredia","sams29@hotmail.es",Roles.Cliente,"BRH-324",LocalDate.of(2024, 2, 24));
        
        
        
        
        GestorAdministracionProductos productos = new GestorAdministracionProductos();
        productos.ingresarProducto(new Producto("Cera Meguiars","Cera para vehiculo",2000.00,10));
        productos.ingresarProducto(new Producto("Spray Meguiars","Spray para vehiculo",3000.00,5));
        productos.ingresarProducto(new Producto("Paño Meguiars","Paño para vehiculo",4000.00,25));
        productos.listarProductos();
        
        productos.registroCompras(cliente01, 11300, TARJETA);
        productos.registroCompras(cliente02, 22002, EFECTIVO);
        
        productos.listarCompras();
        
    }
    
}
