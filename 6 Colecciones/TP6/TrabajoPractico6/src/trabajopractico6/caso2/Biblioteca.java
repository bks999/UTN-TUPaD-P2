/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.caso2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solyo
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }
    
    public void listarLibros() {
        System.out.println("Lista de libros en biblioteca " + nombre);
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libroEliminar = buscarLibroPorIsbn(isbn);
        if (libroEliminar != null) {
            libros.remove(libroEliminar);
            System.out.println("\nLibro eliminado: " + libroEliminar.getTitulo());
        } else {
            System.out.println("\nNo se ha encontrado un libro con el ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\nLibros publicados en el anio: " + anio + ": ");
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\nAutores disponibles: ");
        ArrayList<String> autores = new ArrayList<>();
        for (Libro  libro : libros) {
            String autor = libro.getAutor().getNombre();
            if (!autores.contains(autor)) {
                autores.add(autor);
                libro.getAutor().mostrarInfo();
            }
        }
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
}
