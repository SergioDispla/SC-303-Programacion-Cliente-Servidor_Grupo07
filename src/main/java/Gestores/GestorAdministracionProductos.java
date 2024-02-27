/**
 *
 * @author 
 */
package Gestores;
import Taller.*;
import java.util.ArrayList;


public class GestorAdministracionProductos {
    ArrayList<Producto> productos = new ArrayList<>();
 
    
    
    public void listarProductos(){
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
    
}
