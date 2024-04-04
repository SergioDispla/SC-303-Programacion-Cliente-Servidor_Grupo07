package Servicio;

import java.util.ArrayList;

/**
Clase para definir los servicios mecanicos disponibles en el taller
 */
public class ServicioMecanico {
    
    //Atributos de un servicio mecanico
    private String nombre;
    private float precio;
    
    public ServicioMecanico(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
     
     
    // Lista estatica para almacenar los servicios mecanicos disponibles en el taller
    public static ArrayList<ServicioMecanico> getServiciosMecanicos() {
        ArrayList<ServicioMecanico> SERVICIOS_MECANICOS = new ArrayList<>();
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de aceite", 25000)); //Numero 0
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de filtros", 5500)); //Numero 1
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de llantas", 45000)); //Numero 2
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de frenos", 80000)); //Numero 3
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Alineación y balanceo", 40000)); //Numero 4
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de suspensión", 120000)); //Numero 5
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de transmisión", 150000)); //Numero 6
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de motor", 200000)); //Numero 7
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Diagnóstico electrónico", 10000)); //Numero 8
        return SERVICIOS_MECANICOS;
    }
}
