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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class GestorReportes {
    

    
    
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
