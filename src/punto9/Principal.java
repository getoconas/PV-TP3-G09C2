package punto9;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        
        Libro l1 = new Libro("150-001", "El manual del guerrero de la luz", "Pablo Coelho", 250.00);
        Libro l2 = new Libro("200-006", "La ciudad de las biestas", "Isabel Allende", 280.00);
        Libro l3 = new Libro("300-055", "Cien años de soledad", "Gabriel García Márquez", 350.00);
        Libro l4 = new Libro("100-454", "El diario de Ana Frank", "Anne Frank", 250.00);
        Libro l5 = new Libro("200-780", "La metamorfosis", "Franz Kafka", 340.00);
        Libro l6 = new Libro("500-330", "El nombre de la rosa", "Umberto Eco", 280.00);
        Libro l7 = new Libro("702-000", "Rayuela", "Julio Cortazar", 300.00);
        
        Inventario inventario = new Inventario();
        
        inventario.agregarLibro(l1);
        inventario.agregarLibro(l2);
        inventario.agregarLibro(l3);
        inventario.agregarLibro(l4);
        inventario.agregarLibro(l5);
        inventario.agregarLibro(l6);
        inventario.agregarLibro(l7);
        
        System.out.println("Los libros fueron cargados sastifactoriamente...");
        System.out.println("");
        System.out.println("Ingrese un titulo para buscar"); 
        nombre = scanner.nextLine();
        
        inventario.buscarLibro(nombre);
    }
}
