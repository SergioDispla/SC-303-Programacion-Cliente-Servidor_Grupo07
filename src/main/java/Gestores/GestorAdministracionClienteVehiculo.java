/*
 * Clase para el registro de los cliente y sus vehiculos respectivos para el mantenimiento.  

Esta clase debera hacer lo siguiente:
- Registrar un clente y su vehiculo
- Listar la informacion del cliente y vehiculo asociado
 */
package Gestores;
import Persona.Cliente;
import Taller.ConectarDB;
import Vehiculo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestorAdministracionClienteVehiculo {
    
    //Atributos de GestorVehiculosCliente
    DefaultTableModel clientesDefaultModel = new DefaultTableModel();

    //Getters and Setters 
    public DefaultTableModel getClientesDefaultModel() {
        return clientesDefaultModel;
    }

    public void setClientesDefaultModel(DefaultTableModel clientesDefaultModel) {
        this.clientesDefaultModel = clientesDefaultModel;
    }
    
    // Metodo para registrar un cliente en la base de datos
    public void registrarCliente(Cliente cliente) {
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar un cliente en la tabla "clientes"
            String consultaCliente = "INSERT INTO clientes (cedula, nombre, telefono, direccion, correoElectronico, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?)";
            
            // Prepara la declaracion SQL para insertar el cliente
            PreparedStatement declaracionCliente = conexion.prepareStatement(consultaCliente);
            declaracionCliente.setString(1, cliente.getCedula());
            declaracionCliente.setString(2, cliente.getNombre());
            declaracionCliente.setString(3, cliente.getTelefono());
            declaracionCliente.setString(4, cliente.getDireccion());
            declaracionCliente.setString(5, cliente.getCorreoElectronico());
            declaracionCliente.setDate(6, java.sql.Date.valueOf(cliente.getFechaRegistro()));
            
            // Ejecutar la consulta para cliente
            declaracionCliente.executeUpdate();
               
            // Cerrar la conexión
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al registrar cliente en la base de datos: " + e.getMessage());
        }
    }
    
    // Metodo para registrar un vehiculo en la base de datos
    public void registrarVehiculo(Vehiculo vehiculo){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
              
            // Consulta SQL para insertar un vehículo en la tabla "vehiculos"
            String consultaVehiculo = "INSERT INTO vehiculos (placa, marca, modelo, año, kilometraje, cedula) VALUES (?, ?, ?, ?, ?, ?)";
            
            // Preparar la declaracin SQL para insertar el vehiculo
            PreparedStatement declaracionVehiculo = conexion.prepareStatement(consultaVehiculo);
            declaracionVehiculo.setString(1, vehiculo.getPlaca());
            declaracionVehiculo.setString(2, vehiculo.getMarca());
            declaracionVehiculo.setString(3, vehiculo.getModelo());
            declaracionVehiculo.setInt(4, vehiculo.getAño());
            declaracionVehiculo.setInt(5, vehiculo.getKilometraje());
            declaracionVehiculo.setString(6, vehiculo.getCedulaCliente());
            
            // Ejecutar la consulta para vehículo
            declaracionVehiculo.executeUpdate();           
            
            // Cerrar la conexión
            conexion.close();
            
            //Notificacion sobre la correcta insercion del registro
            JOptionPane.showMessageDialog(null, "Cliente y Vehículo registrados correctamente en la base de datos");           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar vehículo en la base de datos: " + e.getMessage());
        }
        
    }

    // Metodo para listar clientes de la base de datos
    public void listarClientesYVehiculos(){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT clientes.cedula,clientes.nombre,vehiculos.placa,vehiculos.marca FROM clientes JOIN vehiculos ON clientes.cedula = vehiculos.cedula";
            
            //Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String ced_cliente = resultado.getString("cedula");
                String nombre_cliente = resultado.getString("nombre");
                String placa_vehiculo = resultado.getString("placa");
                String marca_vehiculo = resultado.getString("marca");
                
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {ced_cliente,nombre_cliente,placa_vehiculo,marca_vehiculo};
                String [] columnasTabla = {"Cedula","Nombre","Placa","Marca"};
                clientesDefaultModel.setColumnIdentifiers(columnasTabla);
                //Object [] resultadoConsulta = {ced_cliente,nombre_cliente};
                
                //Definimos el contenido de la tabla
                clientesDefaultModel.addRow(resultadoConsulta);            
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
  
    //Metodo para eliminar productos de la base de datos
    public void eliminarCliente(String cedulaCliente){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta_cliente = "DELETE FROM clientes where cedula = (?)";
            String consulta_vehiculo = "DELETE FROM vehiculos where cedula = (?)";
            
            //Preparar la declaracion SQL #1
            PreparedStatement  declaracion_cliente = conexion.prepareStatement(consulta_cliente);
            declaracion_cliente.setString(1, cedulaCliente); 
            
            //Preparar la declaracion SQL #2
            PreparedStatement  declaracion_vehiculo = conexion.prepareStatement(consulta_vehiculo);
            declaracion_vehiculo.setString(1, cedulaCliente); 
            
            // Ejecutar la consulta y obtener el resultado
            declaracion_cliente.executeUpdate();
            declaracion_vehiculo.executeUpdate();
            
            //Notificamos al usuario sobre la elminacion del producto
            JOptionPane.showMessageDialog(null, "Registros de cliente y vehiculos fueron eliminados");
               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos de la base de datos - Error: " + e.getMessage());
        }
    }
}
