/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

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
        Scanner scanner = new Scanner(System.in);
    triangulo calculo = new triangulo();
    
        System.out.println("Ingrese lado:");
        int lado = scanner.nextInt();
//l1 = scanner.nextInt();
        System.out.println("Ingrese lado:");
        int lado1 = scanner.nextInt();
        System.out.println("Ingrese lado:");
        int lado2 = scanner.nextInt();
    triangulo l1 = new triangulo(lado, lado1, lado2);    
    calculo.verificarTriangulo(l1);
    }
}
