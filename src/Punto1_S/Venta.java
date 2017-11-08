package Punto1_S;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Venta {
    protected String fecha;
    protected Producto producto;
    protected double precio;
    protected int cantidadProducto;
    protected Inventario inventario;
    protected double ganancia;
    
    public Venta (String fecha, Producto producto, double precio, int cantidadProducto){
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }
       
    public void restarDeInventario(Producto producto, int uVendidas){
        inventario.productos.get(producto.getNombre()).setCantidad(
                inventario.productos.get(producto.getNombre()).getCantidad() - uVendidas);
    }
    
    public double calcularGanancia(Producto producto, int uVendidas){
        double ganancias = 0;
        double precioV = producto.getPrecioV();
        double precioC = producto.getPrecioC();
        ganancias = (precioV - precioC)*uVendidas;
        this.ganancia = ganancias;
        return this.ganancia;
    }
}
