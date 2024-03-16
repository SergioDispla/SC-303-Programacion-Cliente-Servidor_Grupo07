package Servicio;

import java.util.ArrayList;
import java.util.List;

/**
Clase para gestionar y registrar los servicios realizados en los vehículos, como reparaciones, mantenimiento.
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

    public float getPrecio() {
        return precio;
    }
       
    // Lista estatica para almacenar los servicios mecanicos disponibles en el taller
    private static final List<ServicioMecanico> SERVICIOS_MECANICOS = new ArrayList<>();

    // Inicializacion estatica de los servicios mecanicos disponibles
    static {
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de aceite", 25000)); //Numero 0
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de filtros", 5500)); //Numero 1
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de llantas", 45000)); //Numero 2
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de frenos", 80000)); //Numero 3
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Alineación y balanceo", 40000)); //Numero 4
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de suspensión", 120000)); //Numero 5
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de transmisión", 150000)); //Numero 6
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de motor", 200000)); //Numero 7
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Diagnóstico electrónico", 10000)); //Numero 8
    }    
    
    public static List<ServicioMecanico> getServiciosMecanicos() {
        return SERVICIOS_MECANICOS;
    }
    
}
