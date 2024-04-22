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
import Taller.ConectarDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestorReportes {
    //Default Models
    DefaultTableModel vehiculoDetalladoVehiculos = new DefaultTableModel();
    DefaultTableModel vehiculoDetalladoMantenimientos = new DefaultTableModel();
    DefaultTableModel vehiculoDetalladoFacturas = new DefaultTableModel();
    DefaultTableModel vehiculoAsociadosCliente = new DefaultTableModel();
    DefaultTableModel vehiculoRegistroMantenimientos = new DefaultTableModel();

    public DefaultTableModel getVehiculoDetalladoVehiculos() {
        return vehiculoDetalladoVehiculos;
    }

    public void setVehiculoDetalladoVehiculos(DefaultTableModel vehiculoDetalladoVehiculos) {
        this.vehiculoDetalladoVehiculos = vehiculoDetalladoVehiculos;
    }

    public DefaultTableModel getVehiculoDetalladoMantenimientos() {
        return vehiculoDetalladoMantenimientos;
    }

    public void setVehiculoDetalladoMantenimientos(DefaultTableModel vehiculoDetalladoMantenimientos) {
        this.vehiculoDetalladoMantenimientos = vehiculoDetalladoMantenimientos;
    }

    public DefaultTableModel getVehiculoDetalladoFacturas() {
        return vehiculoDetalladoFacturas;
    }

    public void setVehiculoDetalladoFacturas(DefaultTableModel vehiculoDetalladoFacturas) {
        this.vehiculoDetalladoFacturas = vehiculoDetalladoFacturas;
    }

    public DefaultTableModel getVehiculoAsociadosCliente() {
        return vehiculoAsociadosCliente;
    }

    public void setVehiculoAsociadosCliente(DefaultTableModel vehiculoAsociadosCliente) {
        this.vehiculoAsociadosCliente = vehiculoAsociadosCliente;
    }

    public DefaultTableModel getVehiculoRegistroMantenimientos() {
        return vehiculoRegistroMantenimientos;
    }

    public void setVehiculoRegistroMantenimientos(DefaultTableModel vehiculoRegistroMantenimientos) {
        this.vehiculoRegistroMantenimientos = vehiculoRegistroMantenimientos;
    }

    
 
    
    public void reporteDetalladoVehiculos(){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT vehiculos.placa,clientes.cedula FROM clientes JOIN vehiculos ON clientes.cedula = vehiculos.cedula";
            
            //Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String placa_vehiculo = resultado.getString("placa");
                String ced_cliente = resultado.getString("cedula");
                
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {placa_vehiculo,ced_cliente};
                String [] columnasTabla = {"Placa","Cedula"};
                vehiculoDetalladoVehiculos.setColumnIdentifiers(columnasTabla);
                
                //Definimos el contenido de la tabla
                vehiculoDetalladoVehiculos.addRow(resultadoConsulta);            
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
        public void reporteVehiculoAsociadoCliente(String cedula){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT placa,marca FROM vehiculos WHERE cedula = (?)";
            
            //Preparar la declaracion SQL #1
            PreparedStatement  declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cedula);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String placa_vehiculo = resultado.getString("placa");
                String marca_vehiculo = resultado.getString("marca");
                
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {placa_vehiculo,marca_vehiculo};
                String [] columnasTabla = {"Placa","Marca"};
                vehiculoAsociadosCliente.setColumnIdentifiers(columnasTabla);
                
                //Definimos el contenido de la tabla
                vehiculoAsociadosCliente.addRow(resultadoConsulta);            
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
     
     public void reporteDetalladoVehiculosMantenimientos(String placa){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT id_operario,servicio FROM registromantenimientos where placa = (?)";
            
            //Preparar la declaracion SQL #1
            PreparedStatement  declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, placa);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String operario = resultado.getString("id_operario");
                String servicios = resultado.getString("servicio");
                
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {operario,servicios};
                String [] columnasTabla = {"Operario ID","Servicios Realizados"};
                vehiculoDetalladoMantenimientos.setColumnIdentifiers(columnasTabla);
                
                //Definimos el contenido de la tabla
                vehiculoDetalladoMantenimientos.addRow(resultadoConsulta);            
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
     
     public void reporteDetalladoVehiculosFacturas(String cedula){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT id,totalpagado FROM ventaservicios where cedula = (?)";
            
            //Preparar la declaracion SQL #1
            PreparedStatement  declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cedula);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String id_factura = resultado.getString("id");
                String totalpagado = resultado.getString("totalpagado");
                
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {id_factura,totalpagado};
                String [] columnasTabla = {"N. Factura","Total Pagado"};
                vehiculoDetalladoFacturas.setColumnIdentifiers(columnasTabla);
                
                //Definimos el contenido de la tabla
                vehiculoDetalladoFacturas.addRow(resultadoConsulta);            
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
     
         public void listarMantenimientos(String id_operario) {
            try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para seleccionar todos los registros de ventas
            String consulta = "SELECT cedula,placa,servicio FROM registroMantenimientos where id_operario = (?)";
            
            // Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, id_operario);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
            
            while (resultado.next()) {
                String cedula_cliente = resultado.getString("cedula");
                String placa = resultado.getString("placa");
                String servicio = resultado.getString("servicio");
                
                
                //Creamos un array tipo objeto con los resultados de la consulta
                Object [] resultadoConsulta = {cedula_cliente,placa,servicio};
                
                //Definimos el contenido de la tabla
                String [] columnasTabla = {"Cédula Cliente","Placa","Servicios"};
                vehiculoRegistroMantenimientos.setColumnIdentifiers(columnasTabla);
                vehiculoRegistroMantenimientos.addRow(resultadoConsulta);  
            }
            
            // Cerrar la conexión
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las ventas de la base de datos: " + e.getMessage());
        }
            
    }        
     
 
}
