/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio13;

/**
 *
 * @author solyo
 */
public class GeneradorQR {
    public static void generar(String valor, Usuario2 usuario){
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario2(usuario);
        System.out.println("Codigo QR generado: " + codigo);
    }
}
