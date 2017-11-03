package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Ventas {
    public String fecha;
    public Producto producto;
    public double precio;
    public int cantidadProducto;
    public Inventario inventario;
    
    public Ventas (String fecha, Producto producto, double precio, int cantidadProducto){
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }
       
    public void restarDeInventario(Producto producto, int uVendidas){
        inventario.productos.get(producto.getNombre()).setCantidad(
                inventario.productos.get(producto.getNombre()).getCantidad() - uVendidas);
    }
}
