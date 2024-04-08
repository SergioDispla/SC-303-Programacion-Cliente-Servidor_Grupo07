/*
- Clase para gestionar los mantenimientos realizados a los vehiculos 
 */
package Gestores;

import Persona.Cliente;
import Persona.Operario;
import Servicio.ServicioMecanico;
import Taller.ConectarDB;
import Vehiculo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorMantenimientos {
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Implementacion para asociar un cliente, un vehículo y un servicio mecánico al mantenimiento
    public void registrarMantenimiento(Cliente cliente, Vehiculo vehiculo, ServicioMecanico servicio, Operario operario) {         
        try {
                // Establecer conexión a la base de datos
                ConectarDB connect = new ConectarDB();
                Connection conexion = connect.conectarDB();

                // Consulta SQL para insertar la transaccion en la tabla de "registromantenimiento"
                String consulta = "INSERT INTO registromantenimientos (cedula, placa, servicio, id_operario) VALUES (?, ?, ?,?)";

                // Se realiza el armado de la consulta
                PreparedStatement declaracion = conexion.prepareStatement(consulta);
                declaracion.setString(1, cliente.getNombre()); 
                declaracion.setString(2, vehiculo.getPlaca());
                declaracion.setString(3, servicio.toString());
                declaracion.setString(4, operario.getIdEmpleado());

                // Ejecuta la insercion
                declaracion.executeUpdate();

                // Cierra la conexion
                conexion.close();

                System.out.println("Transacción de venta guardada en la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error al guardar la transacción de venta en la base de datos: " + e.getMessage());
            }
        System.out.println("Cliente: " + cliente.getNombre() + ", Vehículo: " + 
                vehiculo.getPlaca() + ", Servicio: " + servicio + ", Operario ID: " + operario.getIdEmpleado());
  
    
    }
    
}
