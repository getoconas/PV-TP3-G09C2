package punto1;

/**/

public class Principal {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3, 4);
        System.out.println("La distancia entre los puntos P1(1,2) y P2(3,4) es: " + punto1.calcularDistanciaEntrePuntos(punto2));
    }
}
