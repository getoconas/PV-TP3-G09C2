package punto12;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean salir = false;
        boolean control = false;
        String buscar, nombre;
        int opcion;
        
        while (!salir) {
            System.out.println("1 - Cargar lista de libros");
            System.out.println("2 - Mostrar libros");
            System.out.println("3 - Buscar libros por categorias y/o titulo");
            System.out.println("4 - Buscar libros por autor");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();
            char c;
            
            switch (opcion) {
                case 1:
                    Libro l1 = new Libro("150-001", "El manual del guerrero de la luz", "Pablo Coelho", 250.00, "Novela");
                    Libro l2 = new Libro("200-006", "La ciudad de las biestas", "Isabel Allende", 280.00, "Novela");
                    Libro l3 = new Libro("300-055", "Cien años de soledad", "Gabriel García Márquez", 350.00, "Novela");
                    Libro l4 = new Libro("100-454", "El diario de Ana Frank", "Anne Frank", 250.00, "Novela");
                    Libro l5 = new Libro("200-780", "La metamorfosis", "Franz Kafka", 340.00, "Novela");
                    Libro l6 = new Libro("500-330", "El nombre de la rosa", "Umberto Eco", 280.00, "Novela");
                    Libro l7 = new Libro("702-000", "Rayuela", "Julio Cortazar", 300.00, "Novela");
                    
                    inventario.agregarLibro(l1);
                    inventario.agregarLibro(l2);
                    inventario.agregarLibro(l3);
                    inventario.agregarLibro(l4);
                    inventario.agregarLibro(l5);
                    inventario.agregarLibro(l6);
                    inventario.agregarLibro(l7);

                    System.out.println("Libros cargados correctamente...");
                    System.out.println("");
                    control = true;
                    break;
                case 2:
                    if (control) {
                        System.out.println("");
                        inventario.mostrarLibro();
                        break;
                    } else {
                        System.out.println("Debe cargar los libros...");
                        System.out.println("");
                        break;
                    }
                case 3:
                    if (control) {
                        System.out.println("");
                        System.out.println("Ingrese categoria o titulo para la busqueda");
                        buscar = scanner.nextLine();
                        inventario.buscarLibro(buscar);
                        break;
                    } else {
                        System.out.println("Debe cargar los libros...");
                        System.out.println("");
                        break;
                    }
                case 4:
                    if (control) {
                        System.out.println("");
                        System.out.println("Ingrese el autor para la busqueda");
                        nombre = scanner.nextLine();
                        inventario.buscarLibroAutor(nombre);
                        break;
                    } else {
                        System.out.println("Debe cargar los libros...");
                        System.out.println("");
                        break; 
                    }
                case 5:
                    System.out.println("Fin del programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta...");
                    break;
            }
            
        }   
        
        
        
        
        
        
    }
}
