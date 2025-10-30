/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.caso3;

/**
 *
 * @author solyo
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        String prof = (profesor != null) ? profesor.getId() + " - " + profesor.toString() : "Ninguno";
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + prof + '}';
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) {
            return;
        }
        
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        
        this.profesor = profesor;
        
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.getCursos().add(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println(this);
    }
}
