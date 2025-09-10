/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author solyo
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
       public void mostrarInfo() {
        System.out.println("Nombre: " + nombre );
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
       
       public void cumplirAnios() {
           edad++;
           System.out.println(nombre + " cumplió años. Ahora tiene " + edad + " años.");
       }
}
