package punto5.util;

import java.util.ArrayList;
import punto5.dominio.Circulo;

/**/

public class GestorCirculo {
    private ArrayList<Circulo> listaCirculos=new ArrayList<Circulo>();

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
