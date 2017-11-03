package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Producto {
    private String nombre;
    private double precioC;
    private double precioV;
    private int cantidad;
    
    public Producto (String nombre, double precioC, double precioV, int cantidad){
        this.nombre = nombre;
        this.precioC = precioC;
        this.precioV = precioV;
        this.cantidad = cantidad;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad (){
        return cantidad;
    }
}
