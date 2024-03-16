
package Taller;
import Producto.Producto;
import Persona.*;
import static Factura.Factura.TipoPago.*;
import java.time.LocalDate;
import Gestores.*;
import Interfaz.InterfazGrafica;
import Persona.Persona.*;

public class Taller {

    public static void main(String[] args) {
        
    
        //Test de clases del paquete persona - crear un objecto de cada clase
       
        //Test Clase Administrador
        //Constructor: String idEmpleado, String usuario, String contrasena, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario
       Administrador admin01 = new Administrador("0001","admin","admin123","1111111","Administrador01 Taller","89898989","Heredia","admin01@talle.cr",Roles.Administrador);

        //Test Clase Operador 
        //Constructor: String idEmpleado, LocalDate fechaContratacion, float salario, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario
        Operador operador01 = new Operador("0002",LocalDate.of(2024, 2, 24),100000,"222222","Operador01 Taller","89898989","Heredia","cliente01@talle.cr",Roles.Operador);        

        
        //Test Clase Cliente 
        //String cedula, String nombre, String telefono, String direccion, String correoElectronico, roles rolUsuario, String placaVehiculo, LocalDate fechaRegistro      
        Cliente cliente01 = new Cliente("AAA-111",LocalDate.of(2024, 2, 24),"333333","Cliente01 Taller","89898989","Heredia","cliente01@taller.cr",Roles.Cliente);        

       
/*      
        //Test GestorAdministracionProducto
        GestorAdministracionProductos productos = new GestorAdministracionProductos();
        
        productos.ingresarProducto(new Producto(123,"Producto 01","Descripcion Producto",2000.00,10));
        productos.ingresarProducto(new Producto(456,"Producto 02","Descripcion Producto",3000.00,5));
        productos.ingresarProducto(new Producto(789,"Producto 03","Descripcion Producto",4000.00,25));
        productos.listarProductos();
        
        productos.registroVentas(cliente01, 11300, TARJETA);
        productos.registroVentas(cliente01, 11304, TARJETA);
        productos.listarVentas();
*/   
        //InterfazGrafica interfaz = new InterfazGrafica();
    
    
    }
    
}
