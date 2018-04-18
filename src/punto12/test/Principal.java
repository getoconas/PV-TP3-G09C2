package punto12.test;

import java.util.Scanner;
import punto12.dominio.Autor;
import punto12.dominio.Categoria;
import punto12.util.Inventario;
import punto12.dominio.Libro;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean salir = false;
        boolean control = false;
        String buscar, nombre;
        int opcion;
        
        Autor a1 = new Autor("Pablo", "Coelho");
        Autor a2 = new Autor("Isabel", "Allende");
        Autor a3 = new Autor("Gabriel", "García Márquez");
        Autor a4 = new Autor("Anne", "Frank");
        Autor a5 = new Autor("Franz", "Kafka");
        Autor a6 = new Autor("Umberto", "Eco");
        Autor a7 = new Autor("Julio", "Cortazar");
        
        Categoria c1 = new Categoria("Ficción");
        Categoria c2 = new Categoria("Aventura");
        Categoria c3 = new Categoria("Novela");
        Categoria c4 = new Categoria("Autobiografía");
        Categoria c5 = new Categoria("Antinovela");
        Categoria c6 = new Categoria("Cuento");
        
        while (!salir) {
            System.out.println("1 - Cargar lista de libros");
            System.out.println("2 - Mostrar libros");
            System.out.println("3 - Buscar libros por categoria");
            System.out.println("4 - Buscar libros por autor");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (!control) {
                        Libro l1 = new Libro("150-001", "El manual del guerrero de la luz", a1, 250.00, c1);
                        Libro l2 = new Libro("200-006", "La ciudad de las biestas", a2, 280.00, c2);
                        Libro l3 = new Libro("300-055", "Cien años de soledad", a3, 350.00, c3);
                        Libro l4 = new Libro("100-454", "El diario de Ana Frank", a4, 250.00, c4);
                        Libro l5 = new Libro("200-780", "La metamorfosis", a5, 340.00, c6);
                        Libro l6 = new Libro("500-330", "El nombre de la rosa", a6, 280.00, c3);
                        Libro l7 = new Libro("702-000", "Rayuela", a7, 300.00, c5);

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
                    } else {
                        System.out.println("Los libros ya fueron cargados...");
                        System.out.println("");
                        break;
                    }
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
