/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5;

import trabajopractico5.ejercicio1.Pasaporte;
import trabajopractico5.ejercicio1.Titular;
import trabajopractico5.ejercicio10.CuentaBancaria;
import trabajopractico5.ejercicio10.Titular1;
import trabajopractico5.ejercicio11.Artista;
import trabajopractico5.ejercicio11.Cancion;
import trabajopractico5.ejercicio11.Reproductor;
import trabajopractico5.ejercicio12.Calculadora;
import trabajopractico5.ejercicio12.Contribuyente;
import trabajopractico5.ejercicio12.Impuesto;
import trabajopractico5.ejercicio13.GeneradorQR;
import trabajopractico5.ejercicio13.Usuario2;
import trabajopractico5.ejercicio14.EditorVideo;
import trabajopractico5.ejercicio14.Proyecto;
import trabajopractico5.ejercicio2.Usuario;
import trabajopractico5.ejercicio2.Celular;
import trabajopractico5.ejercicio2.Bateria;
import trabajopractico5.ejercicio3.Editorial;
import trabajopractico5.ejercicio3.Libro;
import trabajopractico5.ejercicio3.Autor;
import trabajopractico5.ejercicio4.Banco;
import trabajopractico5.ejercicio4.TarjetaDeCredito;
import trabajopractico5.ejercicio4.Cliente;
import trabajopractico5.ejercicio5.Computadora;
import trabajopractico5.ejercicio5.Propietario;
import trabajopractico5.ejercicio6.Mesa;
import trabajopractico5.ejercicio6.Reserva;
import trabajopractico5.ejercicio6.Cliente1;
import trabajopractico5.ejercicio7.Conductor;
import trabajopractico5.ejercicio7.Motor;
import trabajopractico5.ejercicio7.Vehiculo;
import trabajopractico5.ejercicio8.Documento;
import trabajopractico5.ejercicio8.Usuario1;
import trabajopractico5.ejercicio9.CitaMedica;
import trabajopractico5.ejercicio9.Paciente;
import trabajopractico5.ejercicio9.Profesional;

/**
 *
 * @author solyo
 */
public class TrabajoPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=========== Ejercicio 1 ============\n");
        ejercicio1();
        System.out.println("\n=========== Ejercicio 2 ============\n");
        ejercicio2();
        System.out.println("\n=========== Ejercicio 3 ============\n");
        ejercicio3();
        System.out.println("\n=========== Ejercicio 4 ============\n");
        ejercicio4();
        System.out.println("\n=========== Ejercicio 5 ============\n");
        ejercicio5();
        System.out.println("\n=========== Ejercicio 6 ============\n");
        ejercicio6();
        System.out.println("\n=========== Ejercicio 7 ============\n");
        ejercicio7();
        System.out.println("\n=========== Ejercicio 8 ============\n");
        ejercicio8();
        System.out.println("\n=========== Ejercicio 9 ============\n");
        ejercicio9();
        System.out.println("\n=========== Ejercicio 10 ============\n");
        ejercicio10();
        System.out.println("\n=========== Ejercicio 11 ============\n");
        ejercicio11();
        System.out.println("\n=========== Ejercicio 12 ============\n");
        ejercicio12();
        System.out.println("\n=========== Ejercicio 13 ============\n");
        ejercicio13();
        System.out.println("\n=========== Ejercicio 14 ============\n");
        ejercicio14();

    }

    public static void ejercicio1() {
        String imagen = "fotoPrueba1.jpg";
        String formatoImagen = "JPG";
        Titular titular = new Titular("Felipe Sanchez", "42153648");
        Pasaporte pasaporte = new Pasaporte("11112222ABC", "20 de enero de 2012", imagen, formatoImagen);
        pasaporte.setTitular(titular);
        System.out.println(pasaporte);
        System.out.println(titular);
    }

    public static void ejercicio2() {
        Usuario usuario = new Usuario("Nina Ricci", "11223344");
        Bateria bateria = new Bateria("Li-ion 18650", "3500 mAh");
        Celular celular = new Celular("151234567890123", "Samsung", "Galaxy S21", bateria);
        celular.setUsuario(usuario);
        System.out.println(celular);
        System.out.println("Usuario asociado al celular: " + celular.getUsuario().getNombre());
    }

    public static void ejercicio3() {
        Autor autor = new Autor("JK Rowling", "Britanica");
        Editorial editorial = new Editorial("Salamandra", "Travessera de Gracia 47-49,Barcelona,España");
        Libro libro = new Libro("Harry Potter y la piedra filosofal", "9788498382662", editorial);
        libro.setAutor(autor);
        System.out.println(libro);
        System.out.println(libro.getAutor());
        System.out.println(libro.getEditorial());
    }

    public static void ejercicio4() {
        Banco banco = new Banco("Santander", "30-50000845-4");
        Cliente cliente = new Cliente("Jonhy Weber", "45678912");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("0123456789", "20 de febrero de 2030", banco);
        cliente.setTarjetaDeCredito(tarjeta);

        System.out.println(banco);
        System.out.println(cliente);
        System.out.println(tarjeta);
    }

    public static void ejercicio5() {
        Computadora computadora = new Computadora("Acer", "acer12345", "ATX", "Intel Z790");
        Propietario propietario = new Propietario("Martin Gutierrez", "32165487");
        computadora.setPropietario(propietario);
        System.out.println(computadora);
        System.out.println(computadora.getPlaca());
        System.out.println(propietario);
    }

    public static void ejercicio6() {
        Mesa mesa1 = new Mesa(2);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(4);
        Mesa mesa4 = new Mesa(6);
        Mesa mesa5 = new Mesa(8);
        Cliente1 cliente1 = new Cliente1("Sol", "11122233");
        Reserva reserva1 = new Reserva("23/09/2025", 20, mesa3);
        reserva1.setCliente(cliente1);
        Cliente1 cliente2 = new Cliente1("Hernan", "11334455");
        Reserva reserva2 = new Reserva("30/09/2025", 19, mesa5);
        reserva2.setCliente(cliente2);

        System.out.println(reserva1);
        System.out.println(reserva2);

    }

    public static void ejercicio7() {
        Motor motor = new Motor("Nafta", "MTR-2025-XY789");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla 2020", motor);
        Conductor conductor = new Conductor("Laura Gómez", "B1234567");
        vehiculo.setConductor(conductor);

        System.out.println(motor);
        System.out.println(vehiculo);
        System.out.println(conductor);
    }

    public static void ejercicio8() {
        Usuario1 usuario1 = new Usuario1("María Pérez", "maria.perez@email.com");
        Documento documento = new Documento("Trabajo practico 4", "Introduccion a POO", "HASH123ABC", "11/09/2025", usuario1);

        System.out.println(usuario1);
        System.out.println(documento.getFirmaDigital());
        System.out.println(documento);
    }

    public static void ejercicio9() {
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");
        Profesional profesional = new Profesional("Dra. Laura Gómez", "Cardiología");
        CitaMedica citaMedica = new CitaMedica("15/09/2025", "10:30");
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);

        System.out.println(citaMedica);
        System.out.println(citaMedica.getPaciente());
        System.out.println(citaMedica.getProfesional());
    }

    public static void ejercicio10() {
        Titular1 titular1 = new Titular1("Sofía Pérez", "45123987");
        CuentaBancaria cuenta1 = new CuentaBancaria("0123456789012345678901", 250000.20, "CLV123XYZ", "01/09/2025");
        cuenta1.setTitular(titular1);

        System.out.println(titular1);
        System.out.println(cuenta1.getClaveSeguridad());
        System.out.println(cuenta1);
    }

    public static void ejercicio11() {
        Artista artista = new Artista("Shakira", "Pop latino");
        Cancion cancion = new Cancion("Hips don't lie");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }

    public static void ejercicio12() {
        Contribuyente contribuyente = new Contribuyente("Laura Gomez", "27-12345678-3");
        Impuesto impuesto = new Impuesto(2000);
        impuesto.setContribuyente(contribuyente);
        Calculadora.calcular(impuesto);
    }

    public static void ejercicio13() {
        Usuario2 usuario = new Usuario2("Ana Torres", "ana.torres@gmail.com");
        GeneradorQR.generar("QR-123-ABC", usuario);
    }

    public static void ejercicio14() {
        Proyecto proyecto = new Proyecto("Tutorial de Programacion", 30);
        EditorVideo.exportar("AVI", proyecto);
    }
}
