/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.sistemaEcommerce;

/**
 *
 * @author solyo
 */
public class TarjetaCredito implements Pago, PagoConDescuento{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se procesa pago de $" + monto + " con Tarjeta de Credito" );
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }
    
}
