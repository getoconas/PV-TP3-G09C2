/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

/**
 *
 * @author FrancoMaximiliano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
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