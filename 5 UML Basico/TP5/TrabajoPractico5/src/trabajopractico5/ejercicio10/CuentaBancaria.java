/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio10;

/**
 *
 * @author solyo
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular1 titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClaveSeguridad, String claveUltimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClaveSeguridad, claveUltimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular1 getTitular() {
        return titular;
    }

    public void setTitular(Titular1 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad.getCodigo() + ", titular=" + titular.getNombre() + '}';
    }

}
