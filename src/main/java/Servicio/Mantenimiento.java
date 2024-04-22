/*
*Clase para definir los atributos que tendra un mantenimiento
*/
package Servicio;

import Persona.Operario;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mantenimiento {
    
    public enum Estados {
    Completado, En_Progreso, En_cola;
    }
    
    private String id_mantenimiento;
    private ServicioMecanico servicios;
    private LocalDate fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFinal;
    private Operario operarioAsignado;
    private Estados estado;

    
    public String getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(String id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
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