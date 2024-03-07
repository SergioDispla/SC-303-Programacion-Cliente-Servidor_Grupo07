/*
Clase hija de la clase persona. Hereda todos los atributos y metodos de la clase persona
*/
package Persona;
import java.time.LocalDate;

public class Cliente extends Persona {
    
    // Atributos unicos de la clase Cliente
    private String placaVehiculo;
    private LocalDate fechaRegistro;

    //Constructor de la clase Cliente
    public Cliente(String placaVehiculo, LocalDate fechaRegistro, String cedula,
            String nombre, String telefono,String direccion, 
            String correoElectronico, Roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, 
                rolUsuario);
        this.placaVehiculo = placaVehiculo;
        this.fechaRegistro = fechaRegistro;
    }

    //Metodos getters and setters
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Roles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    
    //Metodo de imprimir informacion de los atributos de tipo Cliente. 
    //Este metodo es sobreescrito ya que es heredado de la clase persona
    @Override
    public void informacionPersona(){
        System.out.println("\n\nInformación del Cliente: ");
        System.out.println("Cédula: "+getCedula());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Teléfono: "+getTelefono());
        System.out.println("Dirección: "+getDireccion());
        System.out.println("Correo Electrónico: "+getCorreoElectronico());
        System.out.println("Placa de Vehiculos asociados: "+placaVehiculo);
        System.out.println("Fecha de Registro Cliente: "+fechaRegistro);
        System.out.println("Tipo Usuario: "+getRolUsuario()); 
        
    }    
    
}
