
package Taller;
import Interfaz.InterfazMenuPrincipal;
import Persona.*;
import java.time.LocalDate;
import Persona.Persona.*;

public class Taller {

    public static void main(String[] args) {
        
    
        //Test de clases del paquete persona - crear un objecto de cada clase
       
        //Test Clase Administrador
        //Constructor: String idEmpleado, String usuario, String contrasena, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario
       Administrador admin01 = new Administrador("0001","admin","admin123","1111111","Administrador01 Taller","89898989","Heredia","admin01@talle.cr",Roles.Administrador);

        //Test Clase Operario 
        //Constructor: String idEmpleado, LocalDate fechaContratacion, float salario, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario
        Operario operador01 = new Operario("0002",LocalDate.of(2024, 2, 24),100000,"222222","Operador01 Taller","89898989","Heredia","cliente01@talle.cr",Roles.Operador);        

        
        //Test Clase Cliente 
        //String cedula, String nombre, String telefono, String direccion, String correoElectronico, roles rolUsuario, String placaVehiculo, LocalDate fechaRegistro      
        Cliente cliente01 = new Cliente("AAA-111",LocalDate.of(2024, 2, 24),"333333","Cliente01 Taller","89898989","Heredia","cliente01@taller.cr",Roles.Cliente);        

      
      InterfazMenuPrincipal interfazPrincipal = new InterfazMenuPrincipal();
      interfazPrincipal.setVisible(true);
       
    
    }
    
}
