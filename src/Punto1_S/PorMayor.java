package Punto1_S;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class PorMayor extends Venta{
    
    private String nombreCliente;
    
    public PorMayor(String fecha, Producto producto, double precio, int cantidadProducto, String nombreCliente) {
        super(fecha, producto, precio, cantidadProducto);
        this.nombreCliente = nombreCliente;
    }
    
}
