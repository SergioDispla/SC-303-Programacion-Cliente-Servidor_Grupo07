package Taller;

import java.awt.List;
import java.util.ArrayList;

enum roles {
    Cliente, Operador, Administrador;
}

public class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    private roles rolUsuario;    

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

    public roles getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(roles rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public Persona(String cedula, String nombre, String telefono, 
            String direccion, String correoElectronico, roles rolUsuario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.rolUsuario = rolUsuario;
    }

    
}
