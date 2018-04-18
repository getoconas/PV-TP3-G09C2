package punto8.util;

import punto8.dominio.Libro;
import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Libro> libro;
    
    public Inventario() {
        libro = new ArrayList<Libro>();
    }
    
    //Metodo para agregar un libro de tipo Libro en el arraylist
    public void agregarLibro(Libro libros) {
        libro.add(libros);
    }
    
    //Metodo para mostrar los libros guardados en el arraylist
    public void mostrarLibro() {
        System.out.println("***** Lista de libros ingresados *****");
        for (int i = 0; i < libro.size(); i++) {
            Libro auxiliar = libro.get(i);
            System.out.println("ISBN: " + auxiliar.getIsbn() + " - Autor: " + auxiliar.getAutor() + 
                    " - Titulo: " + auxiliar.getTitulo() + " - Precio: " + auxiliar.getPrecio());
        }
    }
}
