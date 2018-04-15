package punto11;

import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Zapatilla> zapatilla;
    
    public Inventario() {
        zapatilla = new ArrayList<Zapatilla>();
    }
    
    public void agregarZapatilla(Zapatilla zapatillas) {
        zapatilla.add(zapatillas);
    }
    
    public void mostrarZapatilla() {
        System.out.println("*** Listado de Zapatillas ***");
        for (int i = 0; i < zapatilla.size(); i++) {
            Zapatilla auxiliar = zapatilla.get(i);
            System.out.println("----------");
            System.out.println("Marca: " + auxiliar.getMarca());
            System.out.println("Tipo: " + auxiliar.getTipo());
            System.out.println("----------");
        }
    }
}
