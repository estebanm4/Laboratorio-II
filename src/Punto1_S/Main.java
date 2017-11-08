package Punto1_S;

import javax.swing.JOptionPane;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class Main {

    public static void main(String[] args) {
        Panaderia b = new Panaderia("as", "asdas", 23);
        b.crearInventario();
        
        b.inventario.addProducto("jabon", 200, 500, 10);
        b.inventario.sirve();
        b.inventario.mostrarInventario();
        
        System.out.println("Lol");
        JOptionPane.showMessageDialog(null, "lol", "fakiu", 1);
    }
}
