package punto10;

import java.text.DecimalFormat;
import java.util.Scanner;

/**/

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    Cuota[] cuotas = new Cuota[10];
            
    public Producto() {
        
    }
    
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void ingresarCuotas(double precio) {
        double porcentaje, total;
        cuotas[0] = new Cuota(1, precio);
        porcentaje = precio * 1.5 / 100;
        total = porcentaje + precio;
        cuotas[1] = new Cuota(2, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[2] = new Cuota(3, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[3] = new Cuota(4, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[4] = new Cuota(5, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[5] = new Cuota(6, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[6] = new Cuota(9, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[7] = new Cuota(12, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[8] = new Cuota(18, total);
        porcentaje = total * 1.5 / 100;
        total = porcentaje + total;
        cuotas[9] = new Cuota(24, total);
    }
    
    public void mostrarCuotas() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("--------- Información de Cuotas ---------");
        System.out.println("Codigo: " + getCodigo() + " - Producto: " + getNombre());
        for (Cuota cuota : cuotas) {
            System.out.println("Cant. de Cuotas " + cuota.getNumeroCuota() + 
                    " - Total a pagar: " + df.format(cuota.getPrecioCuota()));
        }
        System.out.println("-----------------------------------------");
    }
    
    public void seleccionarCuotas() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Seleccione la cantidad de cuotas");
        int cantidad = scanner.nextInt();
        switch (cantidad) {
            case 1:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[0].getPrecioCuota()));
                break;
            case 2:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[1].getPrecioCuota()));
                break;
            case 3:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[2].getPrecioCuota()));
                break;
            case 4:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[3].getPrecioCuota()));
                break;
            case 5:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[4].getPrecioCuota()));
                break;
            case 6:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[5].getPrecioCuota()));
                break;
            case 9:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[6].getPrecioCuota()));
                break;
            case 12:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[7].getPrecioCuota()));
                break;
            case 18:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[8].getPrecioCuota()));
                break;
            case 24:
                System.out.println("El importe total a pagar es de: " + df.format(cuotas[9].getPrecioCuota()));
                break;
            default:
                System.out.println("Eliga una opcion correcta, vuelva hacer la operación...");
        }
    }
}
