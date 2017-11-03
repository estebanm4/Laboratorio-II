package laboratorio.ii;
import java.util.TreeMap;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Inventario {
    
    public TreeMap <String, Producto> productos;
    
    public Inventario(){
        this.productos = new TreeMap();
    }
    
    public void crearProducto(String nombre, double precioC, double precioV, int cantidad){
        Producto c = new Producto(nombre, precioC, precioV, cantidad);
        productos.put(c.getNombre(), c);
    }
    
    public void borrarProducto(Producto producto){
        productos.remove(producto.getNombre());
    }
}
