package punto6.util;

import punto6.dominio.Rectangulo;
import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Rectangulo> rectangulo;
    
    public Inventario() {
        rectangulo = new ArrayList<Rectangulo>();
    }
    
    //Agrega un rectangulo del tipo Rectangulo al arraylist
    public void agregarRectangulo(Rectangulo rectangulos) {
        rectangulo.add(rectangulos);
    }
    
    //Muestra una lista de rectangulos cargados en el arraylist
    public void mostrarRectangulo() {
        System.out.println("--- Lista de rectangulos cargados ---");
        for (int i = 0; i < rectangulo.size(); i++) {
            Rectangulo auxiliar = rectangulo.get(i);
            System.out.println("----------");
            System.out.println("Punto (X, Y): (" + auxiliar.getX() + ", " + auxiliar.getY() + ")");
            System.out.println("Base: " + auxiliar.getBase());
            System.out.println("Altura: " + auxiliar.getAltura());
            System.out.println("Superficie: " + auxiliar.getSuperficie());
            System.out.println("Perimetro: " + auxiliar.getPerimetro());
            System.out.println("");
        }
    }
    
    //Elimina un elemento del tipo rectangulo del arraylist
    public void elminarRectangulo(int numero) {
        if (rectangulo.size() != 0) {
            if (numero >= 0 && numero < rectangulo.size()) {
                rectangulo.remove(numero);
                System.out.println("Rectangulo eliminado correctamente");
            } else {
                System.out.println("Ingrese una posicion valida...");
                System.out.println("");
            }
        } else {
            System.out.println("El arraylist esta vacio...");
        }
    }
}
