package main;

import laboratorio.ii.Caja;
import laboratorio.ii.Inventario;
import laboratorio.ii.Panaderia;
import logicaPunto1.LogicaPanaderia;

/**
 * @autores Aldo J Márquez, Mateo Pacheco, Luis Suárez, Juan E Muñoz
 */
public class LaboratorioII {

    public static void main(String[] args) {
        Inventario i = new Inventario();
        Caja c = new Caja(500);
        LogicaPanaderia l = new LogicaPanaderia("El triunfo", "calle 187", "9am-8pm", i);
        l.cargar("Inventario.txt");
        l.getPanaderia().setCaja(c);
        l.getPanaderia().getInventario().crearProducto("jabon", 200, 500, 10);
        l.getPanaderia().getInventario().crearProducto("cebolla", 300, 600, 20);
        l.getPanaderia().getInventario().crearProducto("tocino", 400, 700, 30);
        

        l.listarInventario();
        l.mirarCaja();
        try {
            l.guardarInformacion();
        } catch (Exception e) {
            System.err.println("error");
        }

    }

}
