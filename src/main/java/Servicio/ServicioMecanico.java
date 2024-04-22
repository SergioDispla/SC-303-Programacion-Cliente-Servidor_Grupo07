/**
Clase para definir los servicios mecanicos disponibles en el taller
 */
package Servicio;
import java.util.ArrayList;

public class ServicioMecanico {
    
    //Atributos de un servicio mecanico
    private String nombre;
    private float precio;
    private int duracionServicio; 
    
    public ServicioMecanico(String nombre, float precio, int duracionServicio) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracionServicio = duracionServicio;
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

    public int getDuracionServicio() {
        return duracionServicio;
    }

    public void setDuracionServicio(int duracionServicio) {
        this.duracionServicio = duracionServicio;
    }
     
     
    // Lista estatica para almacenar los servicios mecanicos disponibles en el taller
    public static ArrayList<ServicioMecanico> getServiciosMecanicos() {
        ArrayList<ServicioMecanico> SERVICIOS_MECANICOS = new ArrayList<>();
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de aceite", 25000,45)); //Numero 0
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de filtros", 5500,15)); //Numero 1
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Cambio de llantas", 45000,90)); //Numero 2
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de frenos", 80000,60)); //Numero 3
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Alineación y balanceo", 40000,30)); //Numero 4
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de suspensión", 120000,90)); //Numero 5
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de transmisión", 150000,120)); //Numero 6
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Reparación de motor", 200000,360)); //Numero 7
        SERVICIOS_MECANICOS.add(new ServicioMecanico("Diagnóstico electrónico", 10000,10)); //Numero 8
        return SERVICIOS_MECANICOS;
    }
}
