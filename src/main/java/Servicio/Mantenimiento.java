//Clase hija de la clase persona. Hereda todos los atributos y metodos de la clase persona
package Servicio;

import Persona.Operario;
import java.time.LocalDate;


public class Mantenimiento {
    
    public enum Estados {
    Completado, En_Progreso, En_cola;
    }
    
    private ServicioMecanico servicios;
    private LocalDate fecha;
    private LocalDate horaInicio;
    private LocalDate horaFinal;
    private Operario operarioAsignado;
    private String estado;

    public Mantenimiento(ServicioMecanico servicios, LocalDate fecha, LocalDate horaInicio, LocalDate horaFinal, Operario operarioAsignado, String estado) {
        this.servicios = servicios;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.operarioAsignado = operarioAsignado;
        this.estado = estado;
    }

    public ServicioMecanico getServicios() {
        return servicios;
    }

    public void setServicios(ServicioMecanico servicios) {
        this.servicios = servicios;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDate horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Operario getOperarioAsignado() {
        return operarioAsignado;
    }

    public void setOperarioAsignado(Operario operarioAsignado) {
        this.operarioAsignado = operarioAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
}