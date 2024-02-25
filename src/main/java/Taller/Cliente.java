package Taller;

import java.awt.List;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;

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

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
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
