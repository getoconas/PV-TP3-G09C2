package punto6;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int numero, opcion;
        boolean salir = false;
        boolean control = false;
        
        while (!salir) {
            System.out.println("1 - Cargar rectangulos");
            System.out.println("2 - Mostrar rectangulos");
            System.out.println("3 - Eliminar un rectangulo");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.println("Seleccione una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (!control) {
                        Rectangulo r1 = new Rectangulo(3, 5, 10, 20, 30, 38);
                        Rectangulo r2 = new Rectangulo(4, 2, 15, 5, 50, 25);
                        Rectangulo r3 = new Rectangulo(1, 6, 8, 40, 75, 60);
                    
                        inventario.agregarRectangulo(r1);
                        inventario.agregarRectangulo(r2);
                        inventario.agregarRectangulo(r3);
                        
                        System.out.println("Los rectangulos fueron cargados sastifactoriamente...");
                        System.out.println("");
                        control = true;
                        break;
                    } else {
                        System.out.println("Los rectangulos ya fueron cargados...");
                        System.out.println("");
                        break;
                    }
                case 2:
                    if (control) {
                        System.out.println("");
                        inventario.mostrarRectangulo();
                        break;
                    } else {
                        System.out.println("Debe cargar los rectangulos...");
                        System.out.println("");
                        break;
                    }
                case 3:
                    if (control) {
                        System.out.println("Ingrese una posicion para eliminar un rectangulo");
                        numero = scanner.nextInt();
                        inventario.elminarRectangulo(numero);
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Debe cargar los rectangulos...");
                        System.out.println("");
                        break;
                    }
                case 4:
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
