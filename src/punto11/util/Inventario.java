package punto11.util;

import punto11.dominio.Zapatilla;
import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Zapatilla> zapatilla;
    
    public Inventario() {
        zapatilla = new ArrayList<Zapatilla>();
    }
    
    
    //Método para agregar elementos de tipo zapatilla al arraylist
    public void agregarZapatilla(Zapatilla zapatillas) {
        zapatilla.add(zapatillas);
    }
    
    //Método para mostrar el contenido del arraylist
    public void mostrarZapatilla() {
        System.out.println("***** Listado de Zapatillas *****");
        for (int i = 0; i < zapatilla.size(); i++) {
            Zapatilla auxiliar = zapatilla.get(i);
            System.out.println("Marca: " + auxiliar.getMarca());
            System.out.println("Tipo: " + auxiliar.getTipo());
            System.out.println("");
        }
    }
}
