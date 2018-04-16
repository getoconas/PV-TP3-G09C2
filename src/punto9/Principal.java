package punto9;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        
        Libro l1 = new Libro("150-001", "El Manual Guerrero De La Luz", "Coelho, Pablo", 250.00);
        Libro l2 = new Libro("200-006", "La Ciudad De Las Biestas", "Allende, Isabel", 280.00);
        Libro l3 = new Libro("300-055", "Cien Años De Soledad", "García Márquez, Gabriel", 350.00);
        
        Inventario inventario = new Inventario();
        
        inventario.agregarLibro(l1);
        inventario.agregarLibro(l2);
        inventario.agregarLibro(l3);
        
        System.out.println("Libros cargados...");
        System.out.println("------");
        System.out.println("Ingrese un titulo para buscar"); 
        nombre = scanner.nextLine();
        
        inventario.buscarLibro(nombre);
    }
}
