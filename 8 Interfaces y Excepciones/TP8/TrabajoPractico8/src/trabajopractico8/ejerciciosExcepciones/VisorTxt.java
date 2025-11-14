/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.ejerciciosExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author solyo
 */
public class VisorTxt {

    public void mostrarTxt(String ruta) {
        File archivo = new File(ruta);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("No se pudo liberar el br.");
                }
            }
        }
    }
}
