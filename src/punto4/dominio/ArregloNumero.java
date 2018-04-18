package punto4.dominio;

/**/

public class ArregloNumero {
    private int[] numeros;
    
    public ArregloNumero() {
        numeros = new int[10];
    }

    public ArregloNumero(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    //Metodo para mostrar los elementos del arreglo
    public void mostrarElementosDelArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor de elemento: " + numeros[i]);
        }
    }
    
    //Metodo que muestra el mayor numero almacenado en el arreglo
    public void mostrarMayor() {
        int mayor = 0;
        boolean control = true;
        for (int i = 0; i < numeros.length; i++) {
            if (control) {
                mayor = numeros[i];
                control = false;
            } else {
                if (numeros[i] >= mayor) {
                    mayor = numeros[i];
                }
            }
        }
        System.out.println("El mayor de los elementos es: " + mayor);
    }
    
    //Metodo que muestra el menor nymero almacenado en el arreglo
    public void mostrarMenor() {
        int menor = 0;
        boolean control = true;
        for (int i = 0; i < numeros.length; i++) {
            if (control) {
                menor = numeros[i];
                control = false;
            } else {
                if (numeros[i] <= menor) {
                    menor = numeros[i];
                }
            }
        }
        System.out.println("El menor de los elementos es: " + menor);
    }
    
    //Devuelve el promedio de los elementos almacenado en el arreglos
    public void mostrarPromedio() {
        double promedio = 0, sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria = numeros[i] + sumatoria;
        }
        promedio = sumatoria/numeros.length;
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}
