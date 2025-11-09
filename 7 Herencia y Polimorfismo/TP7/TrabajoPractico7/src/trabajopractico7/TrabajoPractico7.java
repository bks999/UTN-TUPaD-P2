/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7;

import java.util.ArrayList;
import java.util.List;
import trabajopractico7.ejercicio1.Auto;
import trabajopractico7.ejercicio2.Circulo;
import trabajopractico7.ejercicio2.FiguraGeometrica;
import trabajopractico7.ejercicio2.Rectangulo;
import trabajopractico7.ejercicio3.Empleado;
import trabajopractico7.ejercicio3.EmpleadoPlanta;
import trabajopractico7.ejercicio3.EmpleadoTemporal;
import trabajopractico7.ejercicio4.Animal;
import trabajopractico7.ejercicio4.Gato;
import trabajopractico7.ejercicio4.Perro;
import trabajopractico7.ejercicio4.Vaca;
import trabajopractico7.ejercicio5.Efectivo;
import trabajopractico7.ejercicio5.Pagable;
import trabajopractico7.ejercicio5.TarjetaCredito;
import trabajopractico7.ejercicio5.Transferencia;

/**
 *
 * @author solyo
 */
public class TrabajoPractico7 {

    /**
     * @param args the command line arguments
     */
    public static <T extends Pagable> void procesarPago(T medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {

        // Ejercicio 1
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        System.out.println("--------------------------------------------------------------------");
        // Ejercicio 2
        FiguraGeometrica[] figuras = {
            new Circulo(3.5),
            new Rectangulo(4, 6),
            new Circulo(7),
            new Rectangulo(3, 9)
        };

        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNombre() + " - Area: " + f.calcularArea());
        }

        System.out.println("--------------------------------------------------------------------");
        // Ejercicio 3
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta(2500, "Luciano"));
        empleados.add(new EmpleadoTemporal(95, 45, "Mariela"));

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.getNombre() + " - Empleado de planta - Sueldo: " + e.calcularSueldo());
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.getNombre() + " - Empleado temporal - Sueldo: " + e.calcularSueldo());
            }
        }

        System.out.println("--------------------------------------------------------------------");
        // Ejercicio 4
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }

        System.out.println("--------------------------------------------------------------------");
        // Ejercicio 5
        procesarPago(new TarjetaCredito(), 1500);
        procesarPago(new Transferencia(), 2650);
        procesarPago(new Efectivo(), 3200);
    }
}
