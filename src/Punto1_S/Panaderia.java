package Punto1_S;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Panaderia {
    private String nombre;
    private String direccion;
    private int telefono;
    public Inventario inventario;

    public Panaderia(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public void crearInventario(){
        this.inventario = new Inventario();
    }
    
    
}
