/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaPunto1;

import laboratorio.ii.Panaderia;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import laboratorio.ii.Inventario;
import laboratorio.ii.Producto;

/**
 *
 * @author FLIA. ESCAMAL
 */
public class LogicaPanaderia {

    private Panaderia panaderia;

    public LogicaPanaderia(String nombre, String direccion, String horario, Inventario inventario) {
        this.panaderia = new Panaderia(nombre, direccion, horario, inventario);
    }

    public Panaderia getPanaderia() {
        return panaderia;
    }

    public void setPanaderia(Panaderia panaderia) {
        this.panaderia = panaderia;
    }
    
    public void listarInventario() {
        String listaInventario = "";
        for (Producto p : this.panaderia.getInventario().getProductos().values()) {
            listaInventario += p.toString();
        }
        System.out.println(listaInventario);
    }

    public void mirarCaja() {
        String s= this.panaderia.getCaja().toString();
        System.out.println(s);
    }

    public void guardarInformacion() throws IOException {
        File cu = new File("Inventario.txt");
        if (!(cu.exists())) {
            cu.createNewFile();
        }
        
        String listaInventario = "";
        for (Producto p : this.panaderia.getInventario().getProductos().values()) {
            listaInventario += p.guardarProducto();
        }

        PrintStream xs = new PrintStream(cu);
        xs.println(listaInventario);
        xs.close();
    }

    public void cargar(String ruta) {

        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if (lectura.exists()) {
            try {
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String nombre;
                double precioC;
                double precioV;
                int cantidad;
                while (flujoEntrada.hasNext()) {
                    
                    nombre = flujoEntrada.next().trim();
                    String precioCs = flujoEntrada.next().trim();
                    String precioVs = flujoEntrada.next().trim();
                    String cantidads = flujoEntrada.next().trim();
                    precioC = Double.parseDouble(precioCs);
                    precioV = Double.parseDouble(precioVs);
                    cantidad = Integer.parseInt(cantidads);

                    this.panaderia.getInventario().crearProducto(nombre, precioC, precioV, cantidad);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LogicaPanaderia.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
