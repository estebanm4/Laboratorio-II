package Punto1_S;

import java.util.*;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Inventario {

    public TreeMap<String, Producto> productos;

    public Inventario() {
        this.productos = new TreeMap<>();
    }

    public void addProducto(String nombre, double precioC, double precioV, int cantidad) {
        Producto p = new Producto(nombre, precioC, precioV, cantidad);
        productos.put(p.getNombre(), p);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto.getNombre());
    }

    public void mostrarInventario() {
      ArrayList<Producto> contenido = new ArrayList();
      productos.values().toString();
      System.out.println(contenido);
        System.out.println("Si");
    }
    
    public void sirve(){
        System.out.println("So");
    }
//    public void mostrarInventario() {
//        for (Producto obj : productos.values()) {
//            System.out.println(obj); // 
//        }
//    }
}
