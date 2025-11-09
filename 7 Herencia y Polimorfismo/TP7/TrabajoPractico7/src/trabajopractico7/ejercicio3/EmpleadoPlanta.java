/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ejercicio3;

/**
 *
 * @author solyo
 */
public class EmpleadoPlanta extends Empleado {

    private double sueldoMensual;

    public EmpleadoPlanta(int sueldoMensual, String nombre) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}
