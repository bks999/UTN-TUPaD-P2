/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.caso3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solyo
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + "}";
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de profesor/a " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + ", especialidad: " + especialidad);
        System.out.println("Cursos dictados: ");
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (i < cursos.size() - 1) {
                System.out.print(c.getNombre() + ", ");
            } else {
                System.out.println(c.getNombre() + ".");
            }
        }
    }
}
