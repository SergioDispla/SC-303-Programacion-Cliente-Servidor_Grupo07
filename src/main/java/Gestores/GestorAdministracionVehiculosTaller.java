/*
Clase para gestionar los vehiculos que sean atendidos en el taller. 

Esta clase va utilizar las siguientes clases:
- Clase ServicioMecanico -> Para indicar que tipo de servicio se le hace al vehiculo
- Clase GestorCliente -> Para asociar un objecto tipo cliente y vehiculo al mantenimiento
- Interface Factura -> Para registrar el mantenimiento como una venta
-
*/
package Gestores;
import java.util.List;
import Factura.Factura;
import static Gestores.GestorAdministracionProductos.conectar;
import Vehiculo.*;
import Persona.Cliente;
import Servicio.ServicioMecanico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorAdministracionVehiculosTaller implements Factura {

    @Override
    public void registroVentas(Cliente cliente, float totalPagado, TipoPago tipoPago) {
        try {
            // Establecer conexión a la base de datos
            Connection conexion = conectar();
            
            // Consulta SQL para insertar la transaccion en la tabla de "registroventas"
            String consulta = "INSERT INTO registroventaservicios (Cliente, TotalPagado, TipoPago) VALUES (?, ?, ?)";
            
            // Se realiza el armado de la consulta
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cliente.getNombre()); 
            declaracion.setFloat(2, totalPagado);
            declaracion.setString(3, tipoPago.toString());
            
            // Ejecuta la insercion
            declaracion.executeUpdate();
            
            // Cierra la conexion
            conexion.close();
            
            System.out.println("Transacción de venta guardada en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al guardar la transacción de venta en la base de datos: " + e.getMessage());
        }        
            }

    @Override
    public void listarVentas() {
            try {
            // Establecer conexion a la base de datos
            Connection conexion = conectar();
            
            // Consulta SQL para seleccionar todos los registros de ventas
            String consulta = "SELECT * FROM registroventas";
            
            // Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
            
            // Imprimir los resultados
            System.out.println("Listado de ventas:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String cliente = resultado.getString("Cliente");
                float total_pagado = resultado.getFloat("TotalPagado");
                String tipo_pago = resultado.getString("TipoPago");
                
                System.out.println("ID Venta: " + id + ", Cliente: " + cliente + ", Total Pagado: " + total_pagado + ", Tipo de Pago: " + tipo_pago);
            }
            
            // Cerrar la conexión
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las ventas de la base de datos: " + e.getMessage());
        }        
        
           }
    
    public void asociarClienteVehiculoYServicio(Cliente cliente, Vehiculo vehiculo, ServicioMecanico servicio) {       
        // Implementacion para asociar un cliente, un vehículo y un servicio mecánico al mantenimiento  
        try {
                // Establecer conexión a la base de datos
                Connection conexion = conectar();

                // Consulta SQL para insertar la transaccion en la tabla de "registromantenimiento"
                String consulta = "INSERT INTO registromantenimientos (Cliente, VehiculoPlaca, Servicio) VALUES (?, ?, ?)";

                // Se realiza el armado de la consulta
                PreparedStatement declaracion = conexion.prepareStatement(consulta);
                declaracion.setString(1, cliente.getNombre()); 
                declaracion.setString(2, vehiculo.getPlaca());
                declaracion.setString(3, servicio.toString());

                // Ejecuta la insercion
                declaracion.executeUpdate();

                // Cierra la conexion
                conexion.close();

                System.out.println("Transacción de venta guardada en la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error al guardar la transacción de venta en la base de datos: " + e.getMessage());
            }
        System.out.println("Cliente: " + cliente.getNombre() + ", Vehículo: " + vehiculo.getPlaca() + ", Servicio: " + servicio);
  
    
    }

    
    //Metodo para conectarse a la base de datos
    public static Connection conectar() throws SQLException {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/taller";
        String usuario = "root";
        String contrasena = "root";

        // Establecer la conexión y retornarla
        return DriverManager.getConnection(url, usuario, contrasena);
    }        
    
}
