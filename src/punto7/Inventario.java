package punto7;

import java.util.Scanner;

/**/
public class Inventario {
    
    public Inventario() {
        
    }
    
    public void mostrarAuto(Auto[] autos) {
        for (int i = 0; i < autos.length; i++) {
            System.out.println("----- INFORMACIÓN DEL AUTO -----");
            System.out.println("Patente: " + autos[i].getPatente());
            System.out.println("Marca: " + autos[i].getMarca());
            System.out.println("Modelo: " + autos[i].getModelo());
            System.out.println("Color: " + autos[i].getColor());
            System.out.println("Tipo de Combustible: " + autos[i].getCombustible());
            System.out.println("");
        }
    }
    
    public void modificarAuto(Auto[] autos) {
        Scanner scanner = new Scanner(System.in);
        String patente, marca, modelo, color, tipo;
        char c;
        
        System.out.println("Ingrese la posicion a modificar");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < autos.length) {
            System.out.println("¿Desea modificar patente? [S/N]");
            System.out.println("Actual patente: " + autos[posicion].getPatente());
            c = scanner.next().charAt(0);
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                System.out.println("Ingrese nueva patente");
                patente = scanner.nextLine();
                autos[posicion].setPatente(patente);
            }
            
            System.out.println("¿Desea modificar marca? [S/N]");
            System.out.println("Actual marca: " + autos[posicion].getMarca());
            c = scanner.next().charAt(0);
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                System.out.println("Ingrese nueva marca");
                marca = scanner.nextLine();
                autos[posicion].setMarca(marca);
            }
            
            System.out.println("¿Desea modificar modelo? [S/N]");
            System.out.println("Actual modelo: " + autos[posicion].getModelo());
            c = scanner.next().charAt(0);
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                System.out.println("Ingrese nuevo modelo");
                modelo = scanner.nextLine();
                autos[posicion].setModelo(modelo);
            }
            
            System.out.println("¿Desea modificar color? [S/N]");
            System.out.println("Actual color: " + autos[posicion].getColor());
            c = scanner.next().charAt(0);
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                System.out.println("Ingrese nuevo color");
                color = scanner.nextLine();
                autos[posicion].setColor(color);
            }
            
            System.out.println("¿Desea modificar tipo de combustible? [S/N]");
            System.out.println("Actual tipo de combustible: " + autos[posicion].getCombustible());
            c = scanner.next().charAt(0);
            scanner.nextLine();
            
            if (c == 'S' || c == 's') {
                System.out.println("Ingrese nuevo tipo de combustible");
                tipo = scanner.nextLine();
                autos[posicion].setCombustible(tipo);
            }
        } else {
            System.out.println("Ingrese una posicion valida...");
            System.out.println("");
        }
    }
}
