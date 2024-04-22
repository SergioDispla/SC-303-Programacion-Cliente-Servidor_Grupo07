/*
Clase para definir los atributos de los productos que se venderan en el taller
*/
package Producto;

public class Producto {
    private int codigoProducto;
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

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Producto(int codigoProducto, String nombre, String descripcion, double precio, int cantidadStock) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    
    public void informacionProductos() {
        System.out.println("Codigo de producto: " + this.codigoProducto);
        System.out.print("Nombre: " + this.nombre);
        System.out.print(", Descripción: " + this.descripcion);
        System.out.print(", Precio: " + this.precio);
        System.out.println(", Cantidad disponible: " + this.cantidadStock);
}
    
    
}
