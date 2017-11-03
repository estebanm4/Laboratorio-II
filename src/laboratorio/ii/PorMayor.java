package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class PorMayor extends Ventas {
    private String nombreCliente; 

    public PorMayor(String nombreCliente, String fecha, Producto producto, double precio, int cantidadProducto) {
        super(fecha, producto, precio, cantidadProducto);
        this.nombreCliente = nombreCliente;
    }
}
