/*
Clase hija de la clase persona. Hereda todos los atributos y metodos de la clase persona
*/
package Persona;
public class Administrador extends Persona {
    
    // Atributos unicos de la clase Administrador
    private String idEmpleado;
    private String usuario;
    private String contrasena;

    
    //Constructor de la clase Administrador
    public Administrador(String idEmpleado, String usuario, String contrasena, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, rolUsuario);
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    
    //Metodos getters and setters
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

    public Roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Roles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    
    //Metodo de imprimir informacion de los atributos de tipo Administrador. 
    //Este metodo es sobreescrito ya que es heredado de la clase persona
    @Override
    public void informacionPersona(){
        System.out.println("\n\nInformación del Administrador: ");
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
