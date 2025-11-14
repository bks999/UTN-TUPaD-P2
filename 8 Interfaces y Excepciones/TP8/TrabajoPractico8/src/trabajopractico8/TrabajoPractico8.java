/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import trabajopractico8.ejerciciosExcepciones.EdadInvalidaException;
import trabajopractico8.ejerciciosExcepciones.VisorTxt;
import trabajopractico8.sistemaEcommerce.Cliente;
import trabajopractico8.sistemaEcommerce.Pedido;
import trabajopractico8.sistemaEcommerce.Producto;
import trabajopractico8.sistemaEcommerce.TarjetaCredito;

/**
 *
 * @author solyo
 */
public class TrabajoPractico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Interfaces en un sistema de E-commerce\n");
        
        Cliente cliente = new Cliente("Sol Yoon");
        Pedido pedido = new Pedido(cliente);
        
        pedido.agregarProducto(new Producto("Pantalon", 1200));
        pedido.agregarProducto(new Producto("Remera", 800));
        
        double totalPedido = pedido.calcularTotal();
        
        System.out.println("Total del pedido: $" + totalPedido);
        
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(totalPedido);
        tarjeta.procesarPago(totalConDescuento);
        
        pedido.cambiarEstado("En Preparacion");
        pedido.cambiarEstado("Enviado");
        
        System.out.println("=============================================");
        
        System.out.println("\nEjercicios sobre Excepciones");
        System.out.println("Ejercicio 1: Division segura\n");
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numerador: ");
            int numerador = sc.nextInt();
            System.out.println("Ingrese el denominador: ");
            int denominador = sc.nextInt();
            
            int resultado = numerador/denominador;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        System.out.println("\n=============================================");
        System.out.println("Ejercicio 2: Conversion de cadena a numero\n");

        System.out.println("Ingrese un texto: ");
        String texto = sc.next();
        try {
            int textoNum = Integer.parseInt(texto);
            System.out.println("Numero valido: " + textoNum);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no puede convertirse a numero.");
        }
        System.out.println("\n=============================================");
        System.out.println("Ejercicio 3: Lectura de archivo\n");
        
        VisorTxt v = new VisorTxt();
        
//        v.mostrarTxt("archivoTexto.txt");
        
        v.mostrarTxt("sC:\\TUP\\2025\\Segundo Cuatrimenstre\\PROGRAMACION 2\\8 Interfaces y Excepciones\\TP8\\TrabajoPractico8\\src\\trabajopractico8\\archivoTexto.txt");

        System.out.println("\n=============================================");
        System.out.println("Ejercicio 4: Excepcion personalizada\n");

        try {
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 110) {
                throw new EdadInvalidaException("Edad inválida. Debe ser entre 0 y 110.");
            }

            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=============================================");
        System.out.println("Ejercicio 5: Uso de try-with-resources\n");
        
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (IOException e) {
            System.out.println("Error accediendo  o leyendo el archivo");
        }
        
    }
}
