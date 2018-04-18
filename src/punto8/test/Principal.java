package punto8.test;

import java.util.Scanner;
import punto8.util.Inventario;
import punto8.dominio.Libro;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        String isbn, autor, titulo;
        double precio;
        boolean salida = false;
        char c;
        
        do {
            System.out.println("***** INGRESO DE LIBRO *****");
            System.out.println("Ingrese el ISBN");
            isbn = scanner.nextLine();
            System.out.println("Ingrese el autor");
            autor = scanner.nextLine();
            System.out.println("Ingrese el titulo");
            titulo = scanner.nextLine();
            System.out.println("Ingrese el precio");
            precio = scanner.nextDouble();
            
            Libro ingreso = new Libro(isbn, titulo, autor, precio);
            inventario.agregarLibro(ingreso);
            
            System.out.println("****** Libro ingresado ******");
            System.out.println("");
            inventario.mostrarLibro();
            System.out.println("¿Desea ingresar mas libros? [S/N]");
            c = scanner.next().charAt(0);
            
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                salida = true;
            } else {
                salida = false;
            }
        } while (salida == true);
                
        inventario.mostrarLibro();
    }
}
