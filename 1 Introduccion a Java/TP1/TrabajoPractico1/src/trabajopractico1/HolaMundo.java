/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author solyo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Escribe un programa que imprima el mensaje: ¡Hola, Java!
        System.out.println("¡Hola, Java!");
        System.out.println("");
        int edad = 18;
double precio = 99.987;
        System.out.printf("Edad: %d, precio: %.2f%n", edad, precio);
//        
//        //Crea un programa que declare las siguientes variables con valores asignados
        String nombre;
        nombre = "Sol";
        System.out.println("Nombre: " + nombre);
        int edad1;
        edad = 35;
        System.out.println("Edad: " + edad  + " mts");
        double altura;
        altura = 1.61;
        System.out.println("Altura: " + altura);
        boolean estudiante;
        estudiante = true;
        System.out.println("Estudiante: " + estudiante);
        System.out.println("");
        
//        // Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla. Usa Scanner para capturar los datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreSolicitado = sc.next();
        System.out.print("Ingrese su edad: ");
        int edadSolicitada = sc.nextInt();
        System.out.println("Su nombre es " + nombreSolicitado + " y tiene " + edadSolicitada + " años.");

/* Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División */

        System.out.println("Ingrese dos numeros enteros");
        System.out.print("Numero 1: ");
        double numero1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        double numero2 = sc.nextDouble();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        
        System.out.println("Operaciones: ");
        System.out.println("    Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("    Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("    Multiplicacion: " + numero1 + " x " + numero2 + " = " + multiplicacion);
        System.out.println("    Division: " + numero1 + " / " + numero2 + " = " + division);

/* Escribe un programa que muestre el siguiente mensaje en consola:  
    Nombre: Juan Pérez  
    Edad: 30 años  
    Dirección: "Calle Falsa 123"  
    
Usa caracteres de escape (\n, \") en System.out.println(). 
*/
        System.out.println("Nombre: Juan Perez\nEdad: 30 años\nDireccion: \"Calle Falsa 123\"");

/* Manejar conversiones de tipo y división en Java.  
            a.	Escribe un programa que divida dos números enteros ingresados por el usuario.  
            b.	Modifica el código para usar double en lugar de int y compara los resultados. 
*/

// Division con numeros enteros
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = sc.nextInt();
        
        int resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
// Division con double
//        double resultadoDouble = (double) num1/num2;
//        double resultadoDouble = (double) num1 / (double) num2;
        double resultadoDouble = num1 / (double) num2; //cualquiera de las tres lineas 92, 93, 94 dan resultados double
        System.out.println("El resultado de la division es: " + resultadoDouble);

    }
    
}
