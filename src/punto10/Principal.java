package punto10;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo del producto");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        Producto p1 = new Producto(codigo, nombre, precio);
        
        p1.ingresarCuotas(precio);
        System.out.println("");
        p1.mostrarCuotas();
        System.out.println("");
        p1.seleccionarCuotas();
    }
}
