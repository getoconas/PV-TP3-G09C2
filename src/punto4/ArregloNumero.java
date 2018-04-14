package punto4;

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
    
    public void mostrarElementosDelArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor de elemento: " + numeros[i]);
        }
    }
}
