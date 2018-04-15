package punto8;

import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Libro> libro;
    
    public Inventario() {
        libro = new ArrayList<Libro>();
    }
    
    public void agregarLibro(Libro libros) {
        libro.add(libros);
    }
    
    public void mostrarLibro() {
        System.out.println("*** LIBROS ***");
        for (int i = 0; i < libro.size(); i++) {
            Libro auxiliar = libro.get(i);
            System.out.println("----------");
            System.out.println("ISBN: " + auxiliar.getIsbn());
            System.out.println("Autor: " + auxiliar.getAutor());
            System.out.println("Titulo: " + auxiliar.getTitulo());
            System.out.println("Precio: " + auxiliar.getPrecio());
            System.out.println("----------");
            System.out.println("");
        }
    }
}
