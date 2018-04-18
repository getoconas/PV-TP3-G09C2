package punto2.test;

import java.util.Scanner;
import punto2.dominio.Rectangulo;

/**/

public class Principal {
    public static void main(String[] args) {
        Rectangulo ingresarPunto = new Rectangulo(4,5);
        Rectangulo calculos = new Rectangulo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo");
        double b = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double h = scanner.nextDouble();
        
        calculos.calcularSegundoPunto(b, h, ingresarPunto);
        calculos.calcularTercerPunto(b, h, ingresarPunto);
        calculos.calcularCuartoPunto(b, h, ingresarPunto);
        System.out.println("La superficie del rectangulo es: " + calculos.calcularSuperficie(b, h));
        System.out.println("El perimetro del rectangulo es: " + calculos.calcularPerimetro(b, h));
    }
}