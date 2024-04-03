/**
Clase para definir las tareas que va a realizar el operador.
* 
* Esta clase debera hacer lo siguiente:
* - Registrar un Operario (Ver en la clase Taller como se registra un operador)
* - Asignar un mantenimiento a un operario 
* 
Sugiero que esta clase utilice las siguientes clases:
- Clase GestorAdministracionVehiculosTaller -> Para asignar el mantenimiento a un operador

 */
package Gestores;


import Persona.*;
import Producto.Producto;
import Servicio.ServicioMecanico;
import Taller.ConectarDB;
import Vehiculo.Vehiculo;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class GestorOperarios extends GestorAdministracionVehiculosTaller {

    DefaultTableModel operariosDefaultModel = new DefaultTableModel();

    public DefaultTableModel getOperariosDefaultModel() {
        return operariosDefaultModel;
    }

    public void setOperariosDefaultModel(DefaultTableModel operariosDefaultModel) {
        this.operariosDefaultModel = operariosDefaultModel;
    }
    
    
    // Metodo para registrar un operario en la base de datos
    public void registrarOperarios(Operario operario) {
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar un producto en la tabla "productos"
            String consulta = "INSERT INTO operarios (id_operario, cedula, nombre, telefono, direccion, correoElectronico, salario, fechaContratacion) VALUES (?,?,?,?,?,?,?,?)";
            
            // Preparar la declaración SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, operario.getIdEmpleado());
            declaracion.setString(2, operario.getCedula());
            declaracion.setString(3, operario.getNombre());
            declaracion.setString(4, operario.getTelefono());
            declaracion.setString(5,operario.getDireccion());
            declaracion.setString(6,operario.getCorreoElectronico());
            declaracion.setFloat(7,operario.getSalario());
            declaracion.setDate(8, java.sql.Date.valueOf(operario.getFechaContratacion()));
            
            // Ejecutar la consulta
            declaracion.executeUpdate();
            
            // Cerrar la conexion
            conexion.close();
            declaracion.close();   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el producto en la base de datos: " + e.getMessage());
        }
        
    }
    
    // Metodo para listar productos de la base de datos
    public void listarOperarios(){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();

            //Connection conexion = conectar();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT id_empleado,nombre FROM operarios";
            
            //Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                String id_Empleado = resultado.getString("id_empleado");
                String nombre = resultado.getString("nombre");

                //Creamos un array tipo objeto con los resultados de la consulta
                Object [] resultadoConsulta = {id_Empleado,nombre};
                
                //Definimos el contenido de la tabla
                operariosDefaultModel.addRow(resultadoConsulta);
                        
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los productos de la base de datos - Error: " + e.getMessage());
        }
    }    

}

