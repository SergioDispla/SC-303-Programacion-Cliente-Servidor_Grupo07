/*
 * Clase para el registro de los cliente y sus vehiculos respectivos para el mantenimiento.  

Esta clase debera hacer lo siguiente:
- Registrar un clente y su vehiculo
- Listar la informacion del cliente y vehiculo asociado
 */
package Gestores;
import Persona.Cliente;
import Vehiculo.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GestorVehiculoCliente {
    
    // Metodo para registrar un cliente y su vehiculo en la base de datos
    public void registrarClienteVehiculo(Cliente cliente, Vehiculo vehiculo) {
        try {
            // Establecer conexion a la base de datos
            Connection conexion = conectar();
            
            // Consulta SQL para insertar un cliente en la tabla "clientes"
            String consultaCliente = "INSERT INTO clientes (cedula, nombre, telefono, direccion, correoElectronico, placaVehiculo, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            // Preparar la declaración SQL para cliente
            PreparedStatement declaracionCliente = conexion.prepareStatement(consultaCliente);
            declaracionCliente.setString(1, cliente.getCedula());
            declaracionCliente.setString(2, cliente.getNombre());
            declaracionCliente.setString(3, cliente.getTelefono());
            declaracionCliente.setString(4, cliente.getDireccion());
            declaracionCliente.setString(5, cliente.getCorreoElectronico());
            declaracionCliente.setString(6, vehiculo.getPlaca());
            declaracionCliente.setDate(7, java.sql.Date.valueOf(cliente.getFechaRegistro()));
            
            // Ejecutar la consulta para cliente
            declaracionCliente.executeUpdate();
            
            // Consulta SQL para insertar un vehículo en la tabla "vehiculos"
            String consultaVehiculo = "INSERT INTO vehiculos (placa, marca, modelo, año, kilometraje, estado) VALUES (?, ?, ?, ?, ?, ?)";
            
            // Preparar la declaración SQL para vehículo
            PreparedStatement declaracionVehiculo = conexion.prepareStatement(consultaVehiculo);
            declaracionVehiculo.setString(1, vehiculo.getPlaca());
            declaracionVehiculo.setString(2, vehiculo.getMarca());
            declaracionVehiculo.setString(3, vehiculo.getModelo());
            declaracionVehiculo.setInt(4, vehiculo.getAño());
            declaracionVehiculo.setDouble(5, vehiculo.getKilometraje());
            declaracionVehiculo.setString(6, vehiculo.getEstado());
            
            // Ejecutar la consulta para vehículo
            declaracionVehiculo.executeUpdate();
            
            // Cerrar la conexión
            conexion.close();
            
            System.out.println("Cliente y vehículo registrados correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente y vehículo en la base de datos: " + e.getMessage());
        }
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
