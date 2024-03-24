
package Taller;
import Interfaz.InterfazMenuPrincipal;
import Persona.*;
import java.time.LocalDate;
import Persona.Persona.*;

public class Taller {

    public static void main(String[] args) {
        
    
        //Test de clases del paquete persona - crear un objecto de cada clase
       
        //Test Clase Administrador
       Administrador admin01 = new Administrador("0001","admin","admin123","1111111","Administrador01 Taller","89898989","Heredia","admin01@talle.cr",Roles.Administrador);

        //Test Clase Operario 
        Operario operador01 = new Operario("0002","222222","Operador01 Taller","89898989","Heredia","cliente01@talle.cr",Roles.Operador,100000,LocalDate.of(2024, 2, 24));        

        
        //Test Clase Cliente 
        Cliente cliente01 = new Cliente("333333","Cliente01 Taller","89898989","Heredia","cliente01@taller.cr",Roles.Cliente,LocalDate.of(2024, 2, 24));        

      
      InterfazMenuPrincipal interfazPrincipal = new InterfazMenuPrincipal();
      interfazPrincipal.setVisible(true);
       
    
    }
    
}
