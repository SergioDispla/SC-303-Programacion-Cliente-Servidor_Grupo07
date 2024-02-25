package Personas;

public class Administrador extends Persona {
    
    public Administrador(String cedula, String nombre, String telefono, 
            String direccion, String correoElectronico, roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, 
                rolUsuario.Administrador);
    }
    
}
