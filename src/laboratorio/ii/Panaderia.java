package laboratorio.ii;
/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Panaderia {
    private String nombre;
    private String direccion;
    private String horario;
    private Ventas ventas;
    private Inventario inventario;
    
    public Panaderia (String nombre, String direccion, String horario){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
    }
}
