/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio11;

/**
 *
 * @author solyo
 */
public class Cancion {

    private String cancion;
    private Artista artista;

    public Cancion(String cancion) {
        this.cancion = cancion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getCancion() {
        return cancion;
    }

}
