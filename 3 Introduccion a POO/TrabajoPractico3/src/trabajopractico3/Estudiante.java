/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author solyo
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public Estudiante() {
    }
    
    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(int puntos) {
        this.calificacion += puntos;
    }
    
    public void bajarCalificacion(int puntos) {
        this.calificacion -= puntos;
    }
}
