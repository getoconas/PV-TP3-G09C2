package punto6;

import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Rectangulo> rectangulo;
    
    public Inventario() {
        rectangulo = new ArrayList<Rectangulo>();
    }
    
    public void agregarRectangulo(Rectangulo rectangulos) {
        rectangulo.add(rectangulos);
    }
    
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
