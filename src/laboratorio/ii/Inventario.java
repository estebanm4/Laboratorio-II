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

    public TreeMap<String, Producto> getProductos() {
        return productos;
    }

    public void setProductos(TreeMap<String, Producto> productos) {
        this.productos = productos;
    }
    
    
    
    public void crearProducto(String nombre, double precioC, double precioV, int cantidad){
        Producto c = new Producto(nombre, precioC, precioV, cantidad);
        this.productos.put(c.getNombre(), c);
    }
    
    public void borrarProducto(String nombreProducto){
        this.productos.remove(nombreProducto);
        System.gc();
    }
    
    public void cambiarPrecioC(String nombreProducto, int precio){
        Producto p = this.productos.get(nombreProducto);
        p.setPrecioC(precio);
    }
    
    public void cambiarPrecioV(String nombreProducto, int precio){
        Producto p = this.productos.get(nombreProducto);
        p.setPrecioV(precio);
    }

    
    
}
