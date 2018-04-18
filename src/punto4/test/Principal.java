package punto4.test;

import java.util.Scanner;
import punto4.dominio.ArregloNumero;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArregloNumero arreglo = new ArregloNumero();
        int contador = 0;
        System.out.println("Ingrese 10 números");
        while(contador < 10) {
            System.out.println("Ingrese número: ");
            arreglo.getNumeros()[contador] = scanner.nextInt();
            contador++;
        }
        arreglo.mostrarElementosDelArreglo();
        System.out.println("");
        arreglo.mostrarMayor();
        System.out.println("");
        arreglo.mostrarMenor();
        System.out.println("");
        arreglo.mostrarPromedio();
    }   
}
