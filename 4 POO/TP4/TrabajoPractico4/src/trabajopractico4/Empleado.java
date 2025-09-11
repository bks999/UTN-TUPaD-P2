/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author solyo
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = (int)(Math.random()*10000); // se asigna automaticamente con numeros aleatorios
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000; // salario por defecto
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * porcentajeAumento / 100;
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id = " + id + ", nombre = " + nombre + ", puesto = " + puesto + ", salario = " + salario + '}';
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
