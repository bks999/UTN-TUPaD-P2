/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio8;

/**
 *
 * @author solyo
 */
public class Usuario1 {
    private String nombre;
    private String email;

    public Usuario1(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario1{" + "nombre=" + nombre + ", email=" + email + '}';
    }
}
