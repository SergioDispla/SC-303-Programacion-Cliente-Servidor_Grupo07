package Persona;

import java.awt.List;
import java.util.ArrayList;

public class Persona {
    public enum Roles {
    Cliente, Operador, Administrador;
    }
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    protected Roles rolUsuario;    
    
    public Persona(String cedula, String nombre, String telefono, 
        String direccion, String correoElectronico, Roles rolUsuario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.rolUsuario = rolUsuario;
    }    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Roles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public void informacionPersona(){
        System.out.println("Cédula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Dirección: "+direccion);
        System.out.println("Correo Electrónico: "+correoElectronico);
        System.out.println("Tipo Usuario: "+rolUsuario); 
        
    }

    
}
