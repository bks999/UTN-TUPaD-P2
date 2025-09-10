/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author solyo
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int edad, int huevosPuestos) {
        this.idGallina = (int)(Math.random() * 100);
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(int cantidadHuevos){
        huevosPuestos += cantidadHuevos;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
        System.out.println("Id de gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
