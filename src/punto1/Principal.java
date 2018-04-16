package punto1;

/**/

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(3,4);
        System.out.println("La distancia entre los dos puntos P1(1,2) y P2(3,4) es: " + punto1.calcularDistanciaEntrePuntos(punto2));
    }
    
}