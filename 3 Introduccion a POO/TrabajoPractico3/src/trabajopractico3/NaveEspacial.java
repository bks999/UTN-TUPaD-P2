/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author solyo
 */
public class NaveEspacial {

    private String nombre;
    private double combustible;

    // Constantes
    private static final double MAX_COMBUSTIBLE = 80;
    private static final double CONSUMO_POR_KM = 1;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println("Nave " + nombre + " despegando...");
    }

    public void avanzar(double distancia) {
        // Fijamos como dato hipotetico: Se consume 1 unidad de combustible por kilometro recorrido.
        double consumoPorDistancia = distancia * CONSUMO_POR_KM;

        if (combustible >= consumoPorDistancia) {
            combustible -= consumoPorDistancia;
            System.out.println("La nave avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(double cantidad) {
        // Fijamos el limite de recarga a 80 unidades de combustible
        if (combustible == MAX_COMBUSTIBLE) {
            System.out.println("El tanque ya está lleno.");
        }
        combustible += cantidad;
        if (combustible > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
        }
        System.out.println("Combustible recargado. Combustible actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Cantidad de combustible: " + combustible + " unidades");
    }
}
