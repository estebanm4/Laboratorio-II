package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class PorMayor extends Ventas {
    private String nombreCliente; 
    
    public PorMayor(String fecha, Producto producto, double precio, String nombreCliente) {
        super(fecha, producto, precio);
        this.nombreCliente = nombreCliente;
    }
}
