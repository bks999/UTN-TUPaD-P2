/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio12;

/**
 *
 * @author solyo
 */
public class Calculadora {
    public static void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() + " para el contribuyente " + impuesto.getContribuyente().getNombre() + ".");
        double total = impuesto.getMonto() * 1.21; // IVA 21%
        System.out.println("Monto total con IVA: $" + total);
    }
}
