/*
Clase para definir los vehiculos que seran atendidos en el taller como parte del mantenimiento
*/
package Vehiculo;

public class Vehiculo {
    
    //Atributos generales del Vehiculo
    private String placa;       
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;
    private String estado;
    //private Iterable<Vehiculo> vehiculos;

    //Constructor de la clase vehiculo
    public Vehiculo(String marca, String modelo, int año, String placa, double kilometraje, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }    

    //Metodos getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }


    //Metodo para imprimir la informacion del objeto tipo vehiculo
    public void InfoVehiculo() {
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Año: " + this.año);
    System.out.println("Placa: " + this.placa);
    System.out.println("Kilometraje: " + this.kilometraje);
    System.out.println("Estado: " + this.estado);
    }   
    
    //Metodo para buscar la placa del vehiculo - pendiente validarlo bien xD
    /*public Vehiculo buscarPlaca(String placa) {
    for (Vehiculo vehiculo : this.vehiculos) {
        if (vehiculo.getPlaca().equals(placa)) {
            return vehiculo;
        }
    }
    return null;
    }*/ 
    
    
}
