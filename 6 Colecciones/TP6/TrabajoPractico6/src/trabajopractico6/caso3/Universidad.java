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
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", profesores=" + profesores + ", cursos=" + cursos + '}';
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
        } else {
            System.out.println("No se puedo asignar: curso o profesor inexistente.");
        }
    }

    public void listarProfesores() {
        System.out.println("\nLista de profesores: ");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\nLista de cursos: ");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso cursoEliminar = buscarCursoPorCodigo(codigo);
        if (cursoEliminar != null) {
            if (cursoEliminar.getProfesor() != null) {
                cursoEliminar.getProfesor().eliminarCurso(cursoEliminar);
            }
            cursos.remove(cursoEliminar);
            System.out.println("Curso eliminado exitosamente.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profEliminar = buscarProfesorPorId(id);
        if (profEliminar != null) {
            for (Curso c : new ArrayList<>(profEliminar.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(profEliminar);
            System.out.println("Profesor eliminado exitosamente.");
        }
    }
    
    public void cantidadCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.toString() + " - cantidad de cursos:" + p.getCursos().size());
        }
    }
}
