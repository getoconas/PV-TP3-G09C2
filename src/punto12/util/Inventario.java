package punto12.util;

import java.text.DecimalFormat;
import punto12.dominio.Libro;
import punto12.dominio.Autor;
import punto12.dominio.Categoria;
import java.util.ArrayList;

/**/

public class Inventario {
    private ArrayList<Libro> libro;
    private ArrayList<Autor> autor;
    private ArrayList<Categoria> categoria;
    
    public Inventario() {
        libro = new ArrayList<Libro>();
        autor = new ArrayList<Autor>();
        categoria = new ArrayList<Categoria>();
    }
    
    //Metodo para agregar un elemento del tipo Libro al arraylist
    public void agregarLibro(Libro libros) {
        libro.add(libros);
    }
    
    //Metodo para agregar un elemento del tipo Autor al arraylist
    public void agregarAutor(Autor autores) {
        autor.add(autores);
    }
    
    //Metodo para agregar un elemento del tipo Categoria al arraylist
    public void agregarCategoria(Categoria categorias) {
        categoria.add(categorias);
    }
    
    //Metodo para mostrar los elementos del arraylist de Libros
    public void mostrarLibro() {
        DecimalFormat df = new DecimalFormat("#.00"); //Para dar formato al numero 
        System.out.println("-------- Libros en el inventario --------");
        for (int i = 0; i < libro.size(); i++) {
            Libro auxiliar = libro.get(i);
            System.out.println("ISBN: " + auxiliar.getIsbn());
            System.out.println("Autor: " + auxiliar.getAutor().getNombre() + " " + auxiliar.getAutor().getApellido());
            System.out.println("Titulo: " + auxiliar.getTitulo());
            System.out.println("Precio: " + df.format(auxiliar.getPrecio()));
            System.out.println("Categoria: " + auxiliar.getCategoria().getTipoCategoria());
            System.out.println("");
        }
    }
    
    //Metodo para buscar un libro de acuerdo a la categoria
    public void buscarLibro(String buscar) {
        boolean encontrado = false;
        DecimalFormat df = new DecimalFormat("#.00"); //Para dar formato al numero 
        for (int i = 0; i < libro.size(); i++) {
            Libro libroEncontrado = libro.get(i);
            if (libroEncontrado.getCategoria().getTipoCategoria().equals(buscar)) {
                System.out.println("");
                System.out.println("ISBN: " + libroEncontrado.getIsbn());
                System.out.println("Autor: " + libroEncontrado.getAutor().getNombre() + " " + libroEncontrado.getAutor().getApellido());
                System.out.println("Titulo: " + libroEncontrado.getTitulo());
                System.out.println("Precio: " + df.format(libroEncontrado.getPrecio()));
                System.out.println("Categoria: " + libroEncontrado.getCategoria().getTipoCategoria());
                System.out.println("");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontro ningun libro con la categoria ingresada");
            System.out.println("");
        }
    }
        
    //Metodo para buscar un libro por Autor, sea nombre o apellido
    public void buscarLibroAutor(String autor) {
        boolean encontrado = false;
        DecimalFormat df = new DecimalFormat("#.00"); //Para dar formato al numero 
        for (int i = 0; i < libro.size(); i++) {
            Libro libroEncontrado = libro.get(i);
            if (libroEncontrado.getAutor().getNombre().equals(autor) || libroEncontrado.getAutor().getApellido().equals(autor)) {
                System.out.println("");
                System.out.println("ISBN: " + libroEncontrado.getIsbn());
                System.out.println("Autor: " + libroEncontrado.getAutor().getNombre() + " " + libroEncontrado.getAutor().getApellido());
                System.out.println("Titulo: " + libroEncontrado.getTitulo());
                System.out.println("Precio: " + df.format(libroEncontrado.getPrecio()));
                System.out.println("Categoria: " + libroEncontrado.getCategoria().getTipoCategoria());
                System.out.println("");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontro ningun libro con el autor ingresado");
            System.out.println("");
        }
    }
}
