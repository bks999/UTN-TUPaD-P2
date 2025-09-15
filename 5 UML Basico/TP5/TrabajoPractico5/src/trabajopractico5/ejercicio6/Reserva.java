/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio6;

/**
 *
 * @author solyo
 */
public class Reserva {
    private String fecha;
    private int hora;
    private Cliente1 cliente;
    private Mesa mesa;

    public Reserva(String fecha, int hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente1 cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + "hs, " + cliente.getNombre() + ", mesa=" + mesa.getNumero() + " con capacidad para " + mesa.getCapacidad() + " personas" + '}';
    }
    
    
}
