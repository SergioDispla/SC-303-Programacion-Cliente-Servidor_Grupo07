package Taller;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Producto(String nombre, String descripcion, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    public void Informacion() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Descripción: " + this.descripcion);
    System.out.println("Precio: " + this.precio);
    System.out.println("Cantidad disponible: " + this.cantidadStock);
}
    
    
}
