package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Ventas {
    public String fecha;
    public Producto producto;
    public double precio;
    
    public Ventas (String fecha, Producto producto, double precio){
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
    }
    
    public void eliminarDeVentas (){
        
    }
}
