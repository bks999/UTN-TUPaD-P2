/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.sistemaEcommerce;

/**
 *
 * @author solyo
 */
public class Cliente implements Notificable{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
    
}
