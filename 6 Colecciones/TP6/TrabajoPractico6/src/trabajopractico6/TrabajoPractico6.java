/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6;

import trabajopractico6.caso1.CategoriaProducto;
import trabajopractico6.caso1.Inventario;
import trabajopractico6.caso1.Producto;
import java.util.Scanner;
import trabajopractico6.caso2.Autor;
import trabajopractico6.caso2.Biblioteca;
import trabajopractico6.caso2.Libro;
import trabajopractico6.caso3.Curso;
import trabajopractico6.caso3.Profesor;
import trabajopractico6.caso3.Universidad;

/**
 *
 * @author solyo
 */
public class TrabajoPractico6 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        caso1();
        caso2();
        caso3();

    }

    public static void caso1() {
// CASO PRACTICO 1
        Producto p1 = new Producto("P001", "Arroz Gallo Oro 1kg", 1850.50, 45, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares Inalámbricos JBL", 23999.99, 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera Oversize Negra", 7900.00, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara de escritorio LED", 12500.00, 18, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Yerba Mate Playadito 1kg", 3100.00, 60, CategoriaProducto.ALIMENTOS);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.listarProductos();

        System.out.print("\nQuiero encontrar un producto con Id: ");
        String id = sc.next();
        System.out.println(inventario.buscarProductoPorId(id));

        System.out.print("\nMostrar productos de esta categoria: ");
        String categoria = sc.next().toUpperCase();
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            if (categoria.equalsIgnoreCase(cat.name())) {
                inventario.filtrarPorCategoria(cat);
            }
        }

        System.out.print("\nQuiero eliminar un producto con id: ");
        String idEliminar = sc.next();
        inventario.eliminarProducto(idEliminar);

        System.out.print("\nActualizacion de stock del producto con Id: ");
        String idActualizar = sc.next();
        System.out.print("Nuevo stock: ");
        int nuevoStock = sc.nextInt();
        inventario.actualizarStock(idActualizar, nuevoStock);

        System.out.println("\nStock actual disponible: " + inventario.obtenerTotalStock());

        System.out.println("\nProducto con mayor stock disponible: " + inventario.obtenerProductoConMayorStock());

        double min = 1000;
        double max = 3000;
        System.out.println("\nLista de productos con precios entre $" + min + " y $" + max + ": ");
        inventario.filtrarProductosPorPrecio(min, max);

        System.out.println("\nCategorias disponible: ");
        inventario.mostrarCategoriasDisponibles();
    }

    public static void caso2() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Julio Cortázar", "Argentina");
        
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y el cáliz de fuego", 2000, a2);
        biblioteca.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, a1);
        
        biblioteca.listarLibros();
        
        System.out.println("\nBusqueda por ISBN");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }
        
        biblioteca.filtrarLibrosPorAnio(1981);
        
        biblioteca.eliminarLibro("ISBN001");
        biblioteca.listarLibros();
        
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        
        biblioteca.mostrarAutoresDisponibles();
    }
    
    public static void caso3() {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P01", "Laura Torres", "Matemática");
        Profesor p2 = new Profesor("P02", "Carlos Gómez", "Informática");
        Profesor p3 = new Profesor("P03", "María López", "Física");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C101", "Álgebra I");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Física I");
        Curso c4 = new Curso("C104", "Estructuras de Datos");
        Curso c5 = new Curso("C105", "Estadística");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P01");
        uni.asignarProfesorACurso("C102", "P02");
        uni.asignarProfesorACurso("C103", "P03");
        uni.asignarProfesorACurso("C104", "P02");
        uni.asignarProfesorACurso("C105", "P01");
        
        uni.listarCursos();
        uni.listarProfesores();
        
        System.out.println("\nCambio de profesor del curso C104");
        uni.asignarProfesorACurso("C104", "P01");
        System.out.println("\nSe verifican los cambios: ");
        uni.listarProfesores();
        
        System.out.println("\nSe elimina el curso C105");
        uni.eliminarCurso("C105");
        System.out.println("\nSe verifican los cambios en profesores");
        uni.listarProfesores();
        
        System.out.println("\nSe elimina al profesor P03");
        uni.eliminarProfesor("P03");
        System.out.println("\nSe verifican los cambios");
        uni.listarCursos();
        
        System.out.println("\nCantidad de cursos por profesor:");
        uni.cantidadCursosPorProfesor();
    }
}
