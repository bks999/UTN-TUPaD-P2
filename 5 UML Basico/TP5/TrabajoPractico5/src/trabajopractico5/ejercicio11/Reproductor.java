/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio11;

/**
 *
 * @author solyo
 */
public class Reproductor {

    public static void reproducir(Cancion cancion) {
        System.out.println("Cancion reproduciendo: " + cancion.getCancion() + ", del artista " + cancion.getArtista().getNombre());
    }
}
