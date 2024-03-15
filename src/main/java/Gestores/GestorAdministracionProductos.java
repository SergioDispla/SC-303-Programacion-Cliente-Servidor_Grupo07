/**
* Clase Hija - hereda los metodos de registroCompras y listarCompras de la interface Factura
* Clase para la administracion de los productos que se venderan en el taller.
* 
* Esta clase incluye: 
* - Registro de Productos 
* - Registro de la compra realizada
* - Listado de la compra realizada
 */
package Gestores;
import Producto.Producto;
import Persona.Cliente;
import Factura.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GestorAdministracionProductos implements Factura {
    
    //Atributo unico de la clase GestorAdministracionProductos
    private float totalPagado;
  
    
    //ArrayList para almacenar los productos
    ArrayList<Producto> productos = new ArrayList<>();   
    //ArrayList para almacenar las ventas
    ArrayList<String> ventasProductos = new ArrayList<>();
    
    //Metodo para registrar productos
    public void ingresarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void listarProductos(){
        for (Producto producto : productos){
            producto.informacionProductos();
        }
    }
    
    //Metodo sobreescrito de la interface factura - Registra la compra en la base de datos "Taller" en la tabla "RegistroCompras"
    @Override
    public void registroCompras(Cliente cliente, float totalPagado, TipoPago tipoPago) {
        // Datos de conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/taller";
        String usuario = "root";
        String contrasena = "root";

        try {
            // Establecer conexión a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            
            // Consulta SQL para insertar la transacción en la tabla de compras
            String consulta = "INSERT INTO registrocompras (Cliente, TotalPagado, TipoPago) VALUES (?, ?, ?)";
            
            // Se realiza el armado de la consulta
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cliente.getNombre()); 
            declaracion.setFloat(2, totalPagado);
            declaracion.setString(3, tipoPago.toString());
            
            // Ejecuta la insercion
            declaracion.executeUpdate();
            
            // Cierra la conexion
            conexion.close();
            
            System.out.println("Transacción de compra guardada en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al guardar la transacción de compra en la base de datos: " + e.getMessage());
        }
    }


    //Metodo sobreescrito de la interface factura
    @Override
    public void listarCompras() {
        // Datos de conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/taller";
        String usuario = "root";
        String contrasena = "root";

        try {
            // Establecer conexión a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            
            // Consulta SQL para seleccionar todos los registros de compras
            String consulta = "SELECT * FROM registrocompras";
            
            // Preparar la declaración SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
            
            // Imprimir los resultados
            System.out.println("Listado de compras:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String cliente = resultado.getString("Cliente");
                float total_pagado = resultado.getFloat("TotalPagado");
                String tipo_pago = resultado.getString("TipoPago");
                
                System.out.println("ID Compra: " + id + ", Cliente: " + cliente + ", Total Pagado: " + total_pagado + ", Tipo de Pago: " + tipo_pago);
            }
            
            // Cerrar la conexión
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las compras de la base de datos: " + e.getMessage());
        }
    }
    
    
        

    
    
    
}
