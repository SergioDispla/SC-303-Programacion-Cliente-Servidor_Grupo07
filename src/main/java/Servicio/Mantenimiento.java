//Clase hija de la clase persona. Hereda todos los atributos y metodos de la clase persona
package Servicio;

import Persona.Operario;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Mantenimiento {
    
    public enum Estados {
    Completado, En_Progreso, En_cola;
    }
    
    private ServicioMecanico servicios;
    private LocalDate fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFinal;
    private Operario operarioAsignado;
    private Estados estado;

    public Mantenimiento(ServicioMecanico servicios, LocalDate fecha, LocalDateTime horaInicio, LocalDateTime horaFinal, Operario operarioAsignado, Estados estado) {
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

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDateTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Operario getOperarioAsignado() {
        return operarioAsignado;
    }

    public void setOperarioAsignado(Operario operarioAsignado) {
        this.operarioAsignado = operarioAsignado;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }  
}