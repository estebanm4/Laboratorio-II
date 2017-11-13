package laboratorio.ii;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public abstract class Transaccion {

    protected String fecha;
    protected int cantidadProducto;
    protected Inventario inventario;
    protected Caja caja;

    public Transaccion(String fecha, int cantidadProducto, Inventario inventario, Caja caja) {
        this.fecha = fecha;
        this.cantidadProducto = cantidadProducto;
        this.inventario = inventario;
        this.caja = caja;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

  


    public abstract void movimiento(String nombreProducto);
}
