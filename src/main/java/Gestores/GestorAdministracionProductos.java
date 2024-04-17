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
import Factura.Factura;
import Taller.ConectarDB;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestorAdministracionProductos implements Factura {
    
    //Atributos de GestorAdministracionProductos
    private float totalPagado;
    private int totalNumeroVentas;
    private float totalMontoVentas;
    private int totalVentasEfectivo;
    private int totalVentasTarjeta;
    DefaultTableModel productosDefaultModel = new DefaultTableModel();
    DefaultTableModel ventasProductos = new DefaultTableModel();
    
    //Getters and Setters para leer el modelo en otras clases
    public float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }

    public DefaultTableModel getProductosDefaultModel() {
        return productosDefaultModel;
    }

    public void setProductosDefaultModel(DefaultTableModel productosDefaultModel) {
        this.productosDefaultModel = productosDefaultModel;
    }

    public DefaultTableModel getVentasProductos() {
        return ventasProductos;
    }

    public void setVentasProductos(DefaultTableModel ventasProductos) {
        this.ventasProductos = ventasProductos;
    }

    public int getTotalNumeroVentas() {
        return totalNumeroVentas;
    }

    public void setTotalNumeroVentas(int totalNumeroVentas) {
        this.totalNumeroVentas = totalNumeroVentas;
    }

    public float getTotalMontoVentas() {
        return totalMontoVentas;
    }

    public void setTotalMontoVentas(float totalMontoVentas) {
        this.totalMontoVentas = totalMontoVentas;
    }

    public int getTotalVentasEfectivo() {
        return totalVentasEfectivo;
    }

    public void setTotalVentasEfectivo(int totalVentasEfectivo) {
        this.totalVentasEfectivo = totalVentasEfectivo;
    }

    public int getTotalVentasTarjeta() {
        return totalVentasTarjeta;
    }

    public void setTotalVentasTarjeta(int totalVentasTarjeta) {
        this.totalVentasTarjeta = totalVentasTarjeta;
    }
    
    
    
    // Metodo para ingresar un producto a la base de datos
    public void ingresarProducto(Producto producto) {
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar un producto en la tabla "productos"
            String consulta = "INSERT INTO productos (codigo, nombre, descripcion, precio, cant_stock) VALUES (?, ?, ?, ?, ?)";
            
            // Preparar la declaración SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, producto.getCodigoProducto());
            declaracion.setString(2, producto.getNombre());
            declaracion.setString(3, producto.getDescripcion());
            declaracion.setDouble(4, producto.getPrecio());
            declaracion.setInt(5, producto.getCantidadStock());
            
            // Ejecutar la consulta
            declaracion.executeUpdate();
            
            // Cerrar la conexion
            conexion.close();
            declaracion.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el producto en la base de datos: " + e.getMessage());
        }
        
    }
    
    //Metodo para cargar un archivo a la base de datos
    public void cargarArchivo(File archivo) {
        // Se utiliza el metodo BufferedReader para leer línea por línea del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            
            //Se procesa cada linea del archivo
            String linea;
            while ((linea = br.readLine()) != null) {
                
                //Se crea un array tipo object para almacenar el valor de cada columna
                Object[] columnasArchivo = linea.split(",");

                //Se inserta el valor de cada columna en el array 
                int codigoProducto = Integer.parseInt((String) columnasArchivo[0]);
                String nombreProducto = (String) columnasArchivo[1];
                String descripcionProducto = (String) columnasArchivo[2];
                float precioProducto = Float.parseFloat((String) columnasArchivo[3]);
                int cantidadProducto = Integer.parseInt((String) columnasArchivo[4]);
                
                //Se llama al metodo de insertar productos y se le pasan las variables
                ingresarProducto(new Producto(codigoProducto,nombreProducto,descripcionProducto,precioProducto,cantidadProducto));
                
            }
        JOptionPane.showMessageDialog(null, "Productos ingresados correctamente en la base de datos");
        } catch (Exception  e) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo - Error: "+ e.getMessage());
            
        }
    }
    
    // Metodo para listar productos de la base de datos
    public void listarProductos(){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "SELECT * FROM productos";
            
            //Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
                           
            //Imprimir los resultados en la tabla
            while (resultado.next()) {
                int cod_producto = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                String descripcion = resultado.getString("descripcion");
                float precio = resultado.getFloat("precio");
                int cantidad_stock = resultado.getInt("cant_stock");
                
                //Creamos un array tipo objeto con los resultados de la consulta
                Object [] resultadoConsulta = {cod_producto,nombre,descripcion,precio,cantidad_stock};
                
                //Definimos el contenido de la tabla
                String [] columnasTabla = {"Cod Producto", "Nombre", "Descripcion", "Precio", "Stock"};
                productosDefaultModel.setColumnIdentifiers(columnasTabla);
                productosDefaultModel.addRow(resultadoConsulta);
                          
            }
            
            // Cerrar la conexión
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los productos de la base de datos - Error: " + e.getMessage());
        }
    }
    
    //Metodo para eliminar productos de la base de datos
    public void eliminarProductos(int codigoProducto){
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            //Consulta SQL para seleccionar todos los registros de los productos
            String consulta = "DELETE FROM productos where codigo = (?)";
            
            //Preparar la declaracion SQL
            PreparedStatement  declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, codigoProducto); 
            
            // Ejecutar la consulta y obtener el resultado
            declaracion.executeUpdate();
            
            //Notificamos al usuario sobre la elminacion del producto
            JOptionPane.showMessageDialog(null, "Producto eliminado");
               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los productos de la base de datos - Error: " + e.getMessage());
        }
    } 
               
    //Metodo sobreescrito de la interface factura - Registra la compra en la base de datos "Taller" en la tabla "ventasproductos"
    @Override
    public void registroVentas(String cedulaCliente, float totalPagado, TipoPago tipoPago) {
        try {
            // Establecer conexión a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar la transaccion en la tabla de "registroventasproductos"
            String consulta = "INSERT INTO ventaproductos (cedula, totalpagado, tipopago) VALUES (?, ?, ?)";
            
            // Se realiza el armado de la consulta
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, cedulaCliente); 
            declaracion.setFloat(2, totalPagado);
            declaracion.setString(3, tipoPago.toString());
            
            // Ejecuta la insercion en la tabla
            declaracion.executeUpdate();
            
            // Cierra la conexion
            conexion.close();
            declaracion.close();
            
            JOptionPane.showMessageDialog(null, "Transacción de venta realizada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la transacción de venta en la base de datos - Error " + e.getMessage());
        }
    }
    
    //Metodo sobreescrito de la interface factura - Lista las compras realizadas que se guardaron en la tabla "ventasproductos"
    @Override
    public void listarVentas() {
        try {
            // Establecer conexion a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para seleccionar todos los registros de ventas de productos
            String consulta = "SELECT * FROM ventaproductos";
            
            // Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();
            
            // Imprimir los resultados
            System.out.println("Listado de ventas:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String cedula_cliente = resultado.getString("cedula");
                float total_pagado = resultado.getFloat("totalpagado");
                String tipo_pago = resultado.getString("tipopago");
            
                //Se crea un array tipo objeto para guardar los resultados del query
                Object [] resultadoConsulta = {id,cedula_cliente,total_pagado,tipo_pago};
                String [] columnasTabla = {"N. Factura","Cédula","Total Pagado","Tipo Pago"};
                ventasProductos.setColumnIdentifiers(columnasTabla);
                
                //Definimos el contenido de la tabla
                ventasProductos.addRow(resultadoConsulta);   
                
                //Adicional de reporteria
                totalNumeroVentas += 1;
                totalMontoVentas += total_pagado;
                if(tipo_pago.startsWith("EFECTIVO")){
                    totalVentasEfectivo += 1;
                } else if (tipo_pago.startsWith("TARJETA")){
                    totalVentasTarjeta += 1;
                } else {
                    System.out.println("No se ha identificado el tipo de pago");
                }
            }
            
            // Cerrar la conexion
            conexion.close();
            resultado.close();
            declaracion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar las ventas de la base de datos - Error: " + e.getMessage());
        }
    }
    

 
}
