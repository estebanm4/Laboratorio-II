package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Producto {
    private String nombre;
    private double precioC;
    private double precioV;
    
    public Producto (String nombre, double precioC, double precioV){
        this.nombre = nombre;
        this.precioC = precioC;
        this.precioV = precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }
}
