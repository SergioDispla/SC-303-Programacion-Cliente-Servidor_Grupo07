package Personas;

import java.time.LocalDate;

public class Cliente extends Persona {
    private String placaVehiculo;
    private LocalDate fechaRegistro;

    
    public Cliente(String cedula, String nombre, String telefono, 
            String direccion, String correoElectronico, roles rolUsuario, 
            String placaVehiculo, LocalDate fechaRegistro) {
        super(cedula, nombre, telefono, direccion, correoElectronico, 
                rolUsuario.Cliente);
        this.placaVehiculo = placaVehiculo;
        this.fechaRegistro = fechaRegistro;
    }

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
    
    @Override
    public void informacionPersona(){
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
