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

import Interfaz.InterfazMenuPrincipal;

import Persona.*;
import Persona.Persona.Roles;
import Taller.ConectarDB;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorOperarios extends GestorAdministracionProductos {

    ArrayList<Operario> operarios = new ArrayList<>();

    public GestorOperarios() {

            //se crea un operador
            //Operario operador02 = new Operario("55995", "60458536", "Michelle", "89256958", "San Jose", "Michelle02@gmail.", Roles.Operador, 252582, LocalDate.of(2024, 1, 15));

            InterfazMenuPrincipal interfazPrincipal = new InterfazMenuPrincipal();
            interfazPrincipal.setVisible(true);

          
    }

    public void asignarMantenimiento(Operario operario, Mantenimiento mantenimiento) {
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //consultar SQL para insertar asignacion de mantenimiento en tabla 
            String consulta = "INSERT INTO asignacionmantenimientos(OperarioCedula, MantenimientoId) VALUES(?,?)";

            //armado de la consulta
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, operario.getCedula());
            declaracion.setInt(3, mantenimiento.getIdMantenimiento());

            //ejecuta la insercion
            declaracion.executeUpdate();

            //cierra la conexion
            conexion.close();

            System.out.println("Mantenimiento asignado al operario exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al regisrar mantenimiento:" + e.getMessage());
        }
    }

}

