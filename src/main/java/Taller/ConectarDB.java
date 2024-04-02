
package Taller;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConectarDB {
    
    
    /*public static Connection conectar() throws SQLException {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/taller";
        String usuario = "root";
        String contrasena = "root";

        // Establecer la conexión y retornarla
        return DriverManager.getConnection(url, usuario, contrasena);
    }*/
   
    
     public Connection conectarDB(){
     Connection conexion = null; 
     try{
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller", "root", "root");
       System.out.println("Conexion exitosa");
       
     }catch(Exception e){
         System.out.println(e);
     }       
     return conexion;
    }
        
    
}
