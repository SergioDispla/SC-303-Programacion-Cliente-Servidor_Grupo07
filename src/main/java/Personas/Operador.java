package Personas;

public class Operador extends Persona {
    
    public Operador(String cedula, String nombre, String telefono, 
            String direccion, String correoElectronico, roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, 
                rolUsuario.Operador);
    }
    
}
