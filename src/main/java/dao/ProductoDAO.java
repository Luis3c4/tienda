/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Producto;

/**
 *
 * @author luis
 */
public interface ProductoDAO {
    public void insertarProducto(Producto producto);
    public Producto obtenerProducto(int id);
    public List<Producto> obtenerTodosProductos();
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(int id);
}
