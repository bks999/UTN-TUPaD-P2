/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.sistemaEcommerce;

/**
 *
 * @author solyo
 */
public class PayPal implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se procesa pago de $" + monto + " con Paypal");
    }
    
}
