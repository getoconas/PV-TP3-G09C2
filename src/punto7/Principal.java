package punto7;

import java.util.Scanner;

/**/

public class Principal {
    public static void main(String[] args) {
        Auto[] autos = new Auto[10];
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        boolean control = false;
        int opcion;
        
        while (!salir) {
            System.out.println("1 - Cargar lista de autos");
            System.out.println("2 - Mostrar autos");
            System.out.println("3 - Modificar un auto");
            System.out.println("4 - Salir");
            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();
            char c;
            
            switch (opcion) {
                case 1:
                    if (!control) {
                        autos[0] = new Auto("AA 015 ER", "Alfa Romeo", "Giulietta", "Blanco", "Nafta Premium");
                        autos[1] = new Auto("AB 305 JU", "Ford", "Eco Sport", "Negro", "Nafta Súper");
                        autos[2] = new Auto("AA 395 PO", "Renault", "Fluence", "Gris", "Gasoil Común");
                        autos[3] = new Auto("AA 901 LU", "Toyota", "Hilux", "Azul", "Nafta Súper");
                        autos[4] = new Auto("AB 711 KF", "Porsche", "911", "Negro", "Nafta Premium");
                        autos[5] = new Auto("AA 803 MM", "Peugeot", "308", "Blanco", "Gasoil Común");
                        autos[6] = new Auto("AC 255 CF", "Lamborghini", "Aventador", "Rojo", "Nafta Premium");
                        autos[7] = new Auto("AB 832 ER", "Ford", "Ka", "Gris", "Gasoil Premium");
                        autos[8] = new Auto("AA 604 JF", "Citroen", "C4 Picasso", "Negro", "Nafta Súper");
                        autos[9] = new Auto("AC 598 AA", "Toyota", "Aygo", "Blanco", "Gasoil Premium");
                        System.out.println("Autos cargados correctamente");
                        System.out.println("");
                        control = true;
                        break;
                    } else {
                        System.out.println("Los autos ya fueron cargados, puede modificarlo en la opcion 3...");
                        break;
                    }                
                case 2:
                    if (control) {
                        System.out.println("");
                        inventario.mostrarAuto(autos);
                        break;
                    } else {
                        System.out.println("Debe cargar los autos");
                        System.out.println("");
                        break;
                    }
                case 3:
                    if (control) {
                        inventario.modificarAuto(autos);
                        break;
                    } else {
                        System.out.println("Debe cargar los autos");
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
