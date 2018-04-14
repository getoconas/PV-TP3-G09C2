package punto4;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArregloNumero arreglo = new ArregloNumero();
        int contador = 0;
        while(contador < 10) {
            System.out.println("Ingrese un número: ");
            arreglo.getNumeros()[contador] = scanner.nextInt();
            contador++;
        }
        arreglo.mostrarElementosDelArreglo();
    }   
}
