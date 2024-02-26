package Personas;

public class Administrador extends Persona {
    private String idEmpleado;
    private String usuario;
    private String contrasena;

    public Administrador(String idEmpleado, String usuario, String contrasena, String cedula, String nombre, String telefono, String direccion, String correoElectronico, roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, rolUsuario.Administrador);
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(roles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public void informacionPersona(){
        System.out.println("Cédula: "+getCedula());
        System.out.println("ID de Empleado: "+idEmpleado);
        System.out.println("Nombre: "+getNombre());
        System.out.println("Teléfono: "+getTelefono());
        System.out.println("Dirección: "+getDireccion());
        System.out.println("Correo Electrónico: "+getCorreoElectronico());
        System.out.println("Usuario de Sistema: "+usuario);    
        System.out.println("Contraseña de Sistema: "+contrasena);

        
    }   
    
}
