package Personas;

import java.time.LocalDate;

public class Operador extends Persona {
    private String idEmpleado;
    private LocalDate fechaContratacion;
    private float salario;

    public Operador(String idEmpleado, LocalDate fechaContratacion, 
            float salario, String cedula, String nombre, 
            String telefono, String direccion, String correoElectronico, 
            Roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, rolUsuario);
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Roles rolUsuario) {
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
        System.out.println("Tipo Usuario: "+getRolUsuario());    
        System.out.println("Fecha de Contratación: "+fechaContratacion);
        System.out.println("Salario devengado: "+salario);
        
    }    
    
}
