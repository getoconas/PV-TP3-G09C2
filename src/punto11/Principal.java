package punto11;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salida = false;
        String marca, tipo;
        char c;
        
        Inventario inventario = new Inventario();
        
        do {
            System.out.println("-----");
            System.out.println("Ingrese marca de zapatilla");
            marca = scanner.nextLine();
            System.out.println("");
            System.out.println("Ingrese si es 'original o copia' ");
            tipo = scanner.next();
            
            Zapatilla z1 = new Zapatilla(marca, tipo);
            inventario.agregarZapatilla(z1);
            
            System.out.println("Zapatilla agregada");
            System.out.println("-----");
            System.out.println("¿Desea ingresar mas zapatillas? [S/N]");
            c = scanner.next().charAt(0);
            
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                salida = true;
            } else {
                salida = false;
            }
        } while (salida == true);
        
        inventario.mostrarZapatilla();
    }
}
