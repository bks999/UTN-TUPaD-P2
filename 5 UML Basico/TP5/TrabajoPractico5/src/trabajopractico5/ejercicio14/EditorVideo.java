/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio14;

/**
 *
 * @author solyo
 */
public class EditorVideo {
    public static void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("Render creado del proyecto " + render.getProyecto().getNombre() + " en formato " + render.getFormato());
    }
}
