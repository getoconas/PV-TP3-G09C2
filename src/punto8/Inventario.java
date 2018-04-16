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
        System.out.println("***** Lista de libros ingresados *****");
        for (int i = 0; i < libro.size(); i++) {
            Libro auxiliar = libro.get(i);
            System.out.println("ISBN: " + auxiliar.getIsbn() + " - Autor: " + auxiliar.getAutor() + 
                    " - Titulo: " + auxiliar.getTitulo() + " - Precio: " + auxiliar.getPrecio());
        }
    }
}
