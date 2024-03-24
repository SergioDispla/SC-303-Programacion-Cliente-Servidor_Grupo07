/**
Clase para crear la reporteria de los distintos modulos
* 
* Esta clase debera tener los siguiente reportes:
- Reporte de Operarios
- Reporte de Clientes y Vehículos
- Reporte Detallado de Vehículos
- Reporte de Ventas de Productos
- Reporte General de mantenimientos o reparaciones realizados por la Compañía
 */
package Gestores;
import Persona.Operario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import Persona.Cliente;
import Producto.Producto;
import Servicio.ServicioMecanico;
import Vehiculo.Vehiculo;
import java.util.List;


public class GestorReportes {
    // Método estático para generar el reporte de operarios
    public static void generarReporteOperarios() {
        // Creamos una lista para almacenar los operadores
        ArrayList<Operario> operadores = new ArrayList<>();

        // Creamos objetos de tipo Operario y los agregamos a la lista
        //operadores.add(new Operario("001", LocalDate.of(2020, 5, 15), 2500, "123456789", "Juan Perez", "1234567890", "Calle 123", "juan@example.com", Persona.Roles.Operario));
       // operadores.add(new Operario("002", LocalDate.of(2019, 8, 20), 2800, "987654321", "María López", "0987654321", "Avenida 456", "maria@example.com", Persona.Roles.Operario));
        // Agrega más operadores si es necesario

        // Imprimimos el reporte de operarios
        System.out.println("Reporte de Operarios:");
        for (Operario operador : operadores) {
            operador.informacionPersona();
        }
    }
    // Método para generar el reporte de clientes y vehículos
    public void generarReporteClientesVehiculos(ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculos) {
        System.out.println("Reporte de Clientes y Vehículos:");

        // Iterar sobre la lista de clientes
        for (Cliente cliente : clientes) {
            System.out.println("\nInformación del Cliente:");
            cliente.informacionPersona(); // Imprimir información del cliente
            
            // Buscar el vehículo asociado al cliente por su placa
            Vehiculo vehiculoAsociado = buscarVehiculoPorPlaca(cliente.getPlacaVehiculo(), vehiculos);
            if (vehiculoAsociado != null) {
                System.out.println("\nInformación del Vehículo:");
                vehiculoAsociado.InfoVehiculo(); // Imprimir información del vehículo asociado al cliente
            } else {
                System.out.println("No se encontró información del vehículo asociado al cliente.");
            }
        }
    }

    // Método para buscar un vehículo por su placa en la lista de vehículos
    private Vehiculo buscarVehiculoPorPlaca(String placa, ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null; // Retorna null si no se encuentra el vehículo con la placa especificada
    }
    public static void generarReporteVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        System.out.println("Reporte de Vehículos:");
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("------------------------------");
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAño());
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Kilometraje: " + vehiculo.getKilometraje());
        }
        System.out.println("------------------------------");
        System.out.println("Fin del reporte");
    }
    private ArrayList<Producto> listaProductos;

    public GestorReportes(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void generarReporteProductos() {
        System.out.println("----- Reporte de Productos -----");
        for (Producto producto : listaProductos) {
            producto.informacionProductos();
        }
        System.out.println("--------------------------------");
    }
    // Método para generar un reporte de los servicios realizados
    public static String generarReporteServicios(List<ServicioMecanico> serviciosRealizados) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Servicios Realizados:\n");
        reporte.append("--------------------------------\n");
        
        // Iterar sobre la lista de servicios realizados y agregarlos al reporte
        for (int i = 0; i < serviciosRealizados.size(); i++) {
            ServicioMecanico servicio = serviciosRealizados.get(i);
            reporte.append(i + 1).append(". ").append(servicio.getNombre()).append(": $").append(servicio.getPrecio()).append("\n");
        }
        
        return reporte.toString();
    }
     
    //Metodo para conectarse a la base de datos
    public static Connection conectar() throws SQLException {
    // Datos de conexión a la base de datos
    String url = "jdbc:mysql://localhost:3306/taller";
    String usuario = "root";
    String contrasena = "root";

    // Establecer la conexion y retornarla
    return DriverManager.getConnection(url, usuario, contrasena);
    } 
}
