/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author solyo
 */
public class TrabajoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        registroEstudiantes();
        registroMascotas();
        encapsulamientoLibro();
        gestionGallinasGranjaDigital();
        naveEspacial();

    }

    public static void registroEstudiantes() {
        System.out.println("=========== Ejercicio 1: Registro de Estudiantes ============");
        System.out.println("");
        String nombre = "Sol";
        String apellido = "Yoon";
        String curso = "Programacion 2";
        int calificacion = 60;
        int puntosMas = 40;
        int puntosMenos = 20;
        //  Se instancia un Estudiante
        Estudiante estudiante = new Estudiante(nombre, apellido, curso, calificacion);
        // Mostrar informarcion del estudiante
        estudiante.mostrarInfo();
        // Aumentar calificacion
        estudiante.subirCalificacion(puntosMas);
        estudiante.mostrarInfo();
        // Disminuir calificacion
        estudiante.bajarCalificacion(puntosMas);
        estudiante.mostrarInfo();
        System.out.println("");
    }

    public static void registroMascotas() {
        System.out.println("=========== Ejercicio 2: Registro de Mascotas ============");
        System.out.println("");
        Mascota mascota = new Mascota("Juanito", "perro", 2);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        System.out.println("");
    }

    public static void encapsulamientoLibro() {
        System.out.println("=========== Ejercicio 3: Encapsulamiento con la Clase Libro ============");
        System.out.println("");
        Libro libro = new Libro("Harry Potter y la piedra filosofal", "J.K.Rowling", 2026);
        libro.mostrarInfo();
        int nuevoAnioPublicacion = 1997;
        libro.setAnioPublicacion(nuevoAnioPublicacion);
        libro.mostrarInfo();
        System.out.println("");
    }

    public static void gestionGallinasGranjaDigital() {
        System.out.println("=========== Ejercicio 4: Gestion de Gallinas en Granja Digital ============");
        System.out.println("");
        // Gallina 1
        Gallina gallina1 = new Gallina(2, 45);
        // Gallina 2
        Gallina gallina2 = new Gallina(5, 110);

        // Acciones de la gallina 1
        gallina1.envejecer();
        gallina1.ponerHuevo(20); // Puso 20 huevos en un mes
        gallina1.mostrarEstado();

        // Acciones de la gallina 2
        gallina2.ponerHuevo(15); // Puso 15 huevos en un mes
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.mostrarEstado();
        System.out.println("");
    }

    public static void naveEspacial() {
        System.out.println("=========== Ejercicio 5: Simulacion de Nave Espacial ============");
        System.out.println("");
        NaveEspacial nave = new NaveEspacial("Alfa", 50);
        nave.mostrarEstado(); // Estado inicial
        nave.avanzar(20);
        System.out.println("");
        nave.recargarCombustible(30);
        System.out.println("");
        System.out.println("Estado final:");
        nave.mostrarEstado();
        System.out.println("");
    }
}
