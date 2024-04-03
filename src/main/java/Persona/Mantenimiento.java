//Clase hija de la clase persona. Hereda todos los atributos y metodos de la clase persona
package Persona;

public class Mantenimiento extends Persona  {
    
    private int idMantenimiento;
    private String descripcion;
    private String fecha;
    private String horaInicio;
    private String horaFinal;
    private Operario operarioAsignado;
    private String estado;

    public Mantenimiento(int idMantenimiento, String descripcion, String fecha, String horaInicio, String horaFinal, Operario operarioAsignado, String estado, String cedula, String nombre, String telefono, String direccion, String correoElectronico, Roles rolUsuario) {
        super(cedula, nombre, telefono, direccion, correoElectronico, rolUsuario);
        this.idMantenimiento = idMantenimiento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.operarioAsignado = operarioAsignado;
        this.estado = estado;
    }

    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
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