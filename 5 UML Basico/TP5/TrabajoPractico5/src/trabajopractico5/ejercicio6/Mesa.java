/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio6;

/**
 *
 * @author solyo
 */
public class Mesa {
    private int numero;
    private int capacidad;
    private static int contadorMesa = 0;

    public Mesa(int capacidad) {
        contadorMesa++;
        this.numero = contadorMesa;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }
   public int getCapacidad() {
       return capacidad;
   }
}
