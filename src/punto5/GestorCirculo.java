package punto5;

import java.util.ArrayList;

/**/

public class GestorCirculo {
    private ArrayList<Circulo> listaCirculos=new ArrayList<Circulo>(); //Agregar el new por el NullPointException

    public ArrayList<Circulo> getListaCirculos() {
        return listaCirculos;
    }

    public void setListaCirculos(ArrayList<Circulo> listaCirculos) {
        this.listaCirculos = listaCirculos;
    }
    
    public void addCirculo(Circulo circulo) {
        this.listaCirculos.add(circulo);
    }
    public int cantidad(){
        return this.listaCirculos.size();
    }
}
