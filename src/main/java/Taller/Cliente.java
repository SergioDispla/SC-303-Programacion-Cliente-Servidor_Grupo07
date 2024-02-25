package Taller;

import java.awt.List;
import java.util.ArrayList;

enum roles {
    Cliente, Operador, Administrador;
}

public class Cliente {
    private int cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    private roles rolUsuario;    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public <any> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(<any> vehiculos) {
        this.vehiculos = vehiculos;
    }

    
    public Cliente(String nombre, String direccion, String telefono, String correoElectronico, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.vehiculos = vehiculos;
    }
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.vehiculos = new ArrayList<>();
    }
    public void impVehiculos() {
    System.out.println("Vehículos de " + this.nombre + ":");
    for (Vehiculo vehiculo : this.vehiculos) {
        System.out.println("- Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Año: " + vehiculo.getAño());
    }
}
    
}
