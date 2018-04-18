package punto5.test;

import punto5.util.GestorCirculo;
import java.util.Scanner;
import punto5.dominio.Circulo;

/**/

public class Principal {
    public static void main(String[] args) {
        GestorCirculo listaCirculos = new GestorCirculo();
        Circulo objCirculo;
        char respuesta = 'S';
        
        while(respuesta != 'n' && respuesta != 'N') {
            Scanner scanner = new Scanner(System.in);            
            System.out.print("Ingrese radio del circulo que quiera ingresar: ");
            double radio = scanner.nextDouble();
            
            objCirculo = new Circulo(radio);            
            listaCirculos.addCirculo(objCirculo);
            
            System.out.println("Circulo Añadido!\nSuperficie del circulo añadido: "+objCirculo.getSuperficie());
            System.out.println("¿Quiere ingresar otro Circulo? [S/N]");
            respuesta = scanner.next().charAt(0);
        }
        System.out.println("Se cargaron "+listaCirculos.cantidad()+" elementos en la lista.");
        
        for (Circulo circulo: listaCirculos.getListaCirculos()) //Para recorrer la lista
            System.out.println("Circulo cargado con radio: "+circulo.getRadio()+" cuya superficie es: "+circulo.getSuperficie());
    }
}
