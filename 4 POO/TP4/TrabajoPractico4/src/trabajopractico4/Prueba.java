/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author solyo
 */
public class Prueba {
    public static void main(String[] args) {
        // Se instancian varios empleados
        Empleado empleado1 = new Empleado(11111,"Michael Rex", "Programador", 2100);
        Empleado empleado2 = new Empleado(11112,"Milo Gutierrez", "Product Owner", 2200);
        Empleado empleado3 = new Empleado("Vanesa Fernandez", "Analista");
        Empleado empleado4 = new Empleado("Nina Gonzalez", "Diseñadora");
        
        // Actualizar salarios
        empleado1.actualizarSalario(10); // aumenta 10%
        empleado2.actualizarSalario(300); // aumenta 300 fijos
        empleado3.actualizarSalario(20); // aumenta 20%
        
        // Mostrar informacion de los empleados
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        // Mostrar total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
}
