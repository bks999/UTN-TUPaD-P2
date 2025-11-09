/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.ejercicio2;

/**
 *
 * @author solyo
 */
public class Rectangulo extends FiguraGeometrica{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double altura) {
        super("Rectangulo");
        this.ancho = ancho;
        this.alto = altura;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
  
}
