/*
Clase para gestionar los vehiculos que sean atendidos en el taller. 

Esta clase va utilizar las siguientes clases:
- Clase ServicioMecanico -> Para indicar que tipo de servicio se le hace al vehiculo
- Clase GestorCliente -> Para asociar un objecto tipo cliente y vehiculo al mantenimiento
- Interface Factura -> Para registrar el mantenimiento como una venta
-
*/
package Gestores;
import Factura.Factura;
import Vehiculo.*;
import Persona.Cliente;
import Persona.Operario;
import Servicio.ServicioMecanico;
import Taller.ConectarDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorAdministracionVehiculosTaller implements Factura {

    @Override
    public void registroVentas(String cedulaCliente, float totalPagado, TipoPago tipoPago) {
        try {
            // Establecer conexión a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar la transaccion en la tabla de "ventaservicios"
            String consulta = "INSERT INTO ventaservicios (cedula, totalpagado, tipopago) VALUES (?, ?, ?)";
            
            // Se realiza el armado de la consulta
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cedulaCliente); 
            declaracion.setFloat(2, totalPagado);
            declaracion.setString(3, tipoPago.toString());
            
            // Ejecuta la insercion
            declaracion.executeUpdate();
            
            // Cierra la conexion
            conexion.close();
            
            System.out.println("Transacción de venta realizada");
        } catch (SQLException e) {
            System.out.println("Error al guardar la transacción de venta en la base de datos: " + e.getMessage());
        }        
            }

    @Override
    public void listarVentas() {
            try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para seleccionar todos los registros de ventas
            String consulta = "SELECT * FROM ventaservicios";
            
            // Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
            
            // Imprimir los resultados
            System.out.println("Listado de ventas:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String cedula_cliente = resultado.getString("cedula");
                float total_pagado = resultado.getFloat("totalpagado");
                String tipo_pago = resultado.getString("tipopago");
                
                System.out.println("ID Venta: " + id + ", Cedula: " + cedula_cliente + ", Total Pagado: " + total_pagado + ", Tipo de Pago: " + tipo_pago);
            }
            
            // Cerrar la conexión
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las ventas de la base de datos: " + e.getMessage());
        }        
        
           }
    // Implementacion para asociar un cliente, un vehículo y un servicio mecánico al mantenimiento
    public void registrarMantenimiento(Cliente cliente, Vehiculo vehiculo, ServicioMecanico servicio) {         
        try {
                // Establecer conexión a la base de datos
                ConectarDB connect = new ConectarDB();
                Connection conexion = connect.conectarDB();

                // Consulta SQL para insertar la transaccion en la tabla de "registromantenimiento"
                String consulta = "INSERT INTO registromantenimientos (cedula, placa, servicio, id_operario) VALUES (?, ?, ?)";

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
    }  
}
