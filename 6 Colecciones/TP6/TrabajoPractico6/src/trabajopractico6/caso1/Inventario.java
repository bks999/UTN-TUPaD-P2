/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.caso1;

import java.util.ArrayList;

/**
 *
 * @author solyo
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    public void listarProductos() {
        System.out.println("Lista de productos: ");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if(producto.getId().equalsIgnoreCase(id)) {
                return producto;
            }
        }
        return null;
    }
    
    public void eliminarProducto(String id) {
        Producto buscado = buscarProductoPorId(id);
        if (buscado != null) {
            productos.remove(buscado);
            System.out.println("Producto eliminado: " + buscado.getNombre());
            System.out.println("Productos restantes:");
            listarProductos();
        } else {
            System.out.println("No se encuentra el producto con Id: " + id);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + producto.getNombre() + ": " + nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos en categoria: " + categoria);
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria) {
                producto.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayor.getCantidad()) {
            mayor = producto;
            }
        }
            return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                producto.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for(CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    }
}
