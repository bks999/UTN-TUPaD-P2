package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author solyo
 */
public class TrabajoPractico2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static double descuentoEspecial = 0.10;

    public static void main(String[] args) {
// EJERCICIO 1: VERIFICACION DE AÑO BISIESTO
        ejercicio1();
// EJERCICIO 2: MAYOR NUMERO DE TRES
        ejercicio2();
// EJERCICIO 3: CLASIFICACION DE EDAD
        ejercicio3();
// EJERCICIO 4: CALCULADORA DE DESCUENTO SEGUN CATEGORIA
        ejercicio4();
// EJERCICIO 5: SUMA DE NUMERO PARES
        ejercicio5();
// EJERCICIO 6: CONTADOR DE POSITIVOS, NEGATIVOS Y CEROS
        ejercicio6();
// EJERCICIO 7: VALIDACION DE NOTA ENTRE 0 Y 10
        ejercicio7();
// EJERCICIO 8: CALCULO DEL PRECIO FINAL CON IMPUESTO Y DESCUENTO
        ejercicio8();
// EJERCICIO 9: COMPOSICION DE FUNCIONES PARA CALCULAR COSTO DE ENVIO Y TOTAL DE COMPRA
        ejercicio9();
// EJERCICIO 10: ACTUALIZACION DE STOCK A PARTIR DE VENTA Y RECEPCION DE PRODUCTOS
        ejercicio10();
// EJERCICIO 11: CALCULO DE DESCUENTO ESPECIAL USANDO VARIABLE GLOBAL
        ejercicio11();

    }

    public static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int añoBisiesto = sc.nextInt();

        if ((añoBisiesto % 4 == 0 && añoBisiesto % 100 != 0) || añoBisiesto % 400 == 0) {
            System.out.println("El año " + añoBisiesto + " es bisiesto.");
        } else {
            System.out.println("El año " + añoBisiesto + " no es bisiesto.");
        }
    }

    public static void ejercicio2() {
        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();
        int numeroMayor = 0;

        if (n1 > n2) {
            numeroMayor = n1;
        } else if (n2 > n3) {
            numeroMayor = n2;
        } else if (n3 > n1) {
            numeroMayor = n3;
        } else if (n1 > n3) {
            numeroMayor = n1;
        }
        System.out.println("El mayor es: " + numeroMayor);
    }

    public static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad > 17 && edad < 60) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor");
        }
    }

    public static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase();
        int descuento = 0;
        double precioFinal = 0;
        switch (categoria) {
            case "A":
                descuento = 10;
                break;
            case "B":
                descuento = 15;
                break;
            case "C":
                descuento = 20;
                break;
            default:
                throw new AssertionError();
        }
        precioFinal = precio - (precio * descuento / 100);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    public static void ejercicio5() {
        boolean flag = true;
        int sumaPares = 0;
        while (flag) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            if (numero == 0) {
                flag = false;
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }

    public static void ejercicio6() {
        int numeroIngresado = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeroIngresado = sc.nextInt();

            if (numeroIngresado > 0) {
                positivos++;
            } else if (numeroIngresado < 0) {
                negativos++;
            } else if (numeroIngresado == 0) {
                ceros++;
            }
        }
        System.out.println("\nResultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static void ejercicio7() {
        int nota;
        boolean rango;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota guardada correctamente.");
                rango = true;
            } else {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
                rango = false;
            }
        } while (!rango);
    }

    public static void ejercicio8() {
        System.out.print("Ingrese el precio base del producto: ");
        int precioBase = sc.nextInt();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        int impuesto = sc.nextInt();
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        int descuento = sc.nextInt();
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }

    public static double calcularPrecioFinal(int precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }

    public static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        int precioProducto = sc.nextInt();

        System.out.print("Ingrese el peso del producto en kg: ");
        int pesoProducto = sc.nextInt();

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.next().toLowerCase();

        double costoEnvio = calcularCostoEnvio(pesoProducto, zona);

        System.out.println("El costo de envio es: " + costoEnvio);

        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, costoEnvio));
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        switch (zona) {
            case "nacional":
                costoEnvio = peso * 5;
                break;
            case "internacional":
                costoEnvio = peso * 10;
                break;
        }
        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void ejercicio10() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();
        System.out.print("Ingrse la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibica: ");
        int cantitdadRecibida = sc.nextInt();
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantitdadRecibida));
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        int precioProducto = sc.nextInt();

        System.out.println("El precio final con descuento es: " + calcularDescuentoEspecial(precioProducto));
    }

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }
}
