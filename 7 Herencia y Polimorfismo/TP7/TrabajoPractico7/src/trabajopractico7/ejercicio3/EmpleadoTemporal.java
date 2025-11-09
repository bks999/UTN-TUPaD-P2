/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ejercicio3;

/**
 *
 * @author solyo
 */
public class EmpleadoTemporal extends Empleado {

    private double pagoPorDia;
    private int diasTrabajados;

    public EmpleadoTemporal(double pagoPorDia, int diasTrabajados, String nombre) {
        super(nombre);
        this.pagoPorDia = pagoPorDia;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularSueldo() {
        return pagoPorDia * diasTrabajados;
    }

}
