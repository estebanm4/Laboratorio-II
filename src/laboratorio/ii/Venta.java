/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.ii;

/**
 *
 * @author FLIA. ESCAMAL
 */
public class Venta extends Transaccion {

    public Venta(String fecha, int cantidadProducto, Inventario inventario, Caja caja) {
        super(fecha, cantidadProducto, inventario, caja);
    }

   @Override
    public void movimiento(String nombreProducto) {
       Producto p = this.inventario.productos.get(nombreProducto);
       p.setCantidad(p.getCantidad()-cantidadProducto);
       this.caja.setDinero(caja.getDinero() + p.getPrecioV());
    }
    

}
