package punto9;

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
    
    public void buscarLibro(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < libro.size(); i++) {
            Libro libroEncontrado = libro.get(i);
            if (libroEncontrado.getTitulo().equals(nombre)) {
                System.out.println("----------");
                System.out.println("ISBN: " + libroEncontrado.getIsbn());
                System.out.println("Autor: " + libroEncontrado.getAutor());
                System.out.println("Titulo: " + libroEncontrado.getTitulo());
                System.out.println("Precio: " + libroEncontrado.getPrecio());
                System.out.println("----------");
                System.out.println("");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontro ningun libro con el titulo ingresado");
        }
    }
}
