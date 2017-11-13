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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + '\n' + "nombre: " + nombre + '\n' + "Precio de compra: " + precioC + '\n' + "Precio de Venta: " + precioV + '\n' + "Cantidad: " + cantidad + '\n';
    }
    
    public String guardarProducto(){
        return "," + nombre + ","  + precioC + "," + precioV + "," + cantidad;
    }
    
    
}
