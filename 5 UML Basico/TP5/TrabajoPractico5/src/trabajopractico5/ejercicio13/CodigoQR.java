/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio13;

/**
 *
 * @author solyo
 */
public class CodigoQR {
    private String valor;
    private Usuario2 usuario2;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario2(Usuario2 usuario2) {
        this.usuario2 = usuario2;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario2 + '}';
    }
    
    
}
