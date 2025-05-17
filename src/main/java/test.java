
import dao.ConexionDB;
import dao.ProductoDAO;
import dao.ProductoDAOimpl;
import java.util.List;
import modelo.Producto;

public class test {

    public static void main(String[] args) {
        ConexionDB.getConexion();
        ProductoDAO productoDAO = new ProductoDAOimpl();
        //INSERCION
        Producto nuevoProducto = new Producto("Laptop OMEN", 899.99, 10);
        productoDAO.insertarProducto(nuevoProducto);
        System.out.println("Producto insertado con ID: " + nuevoProducto.getIdProducto());

        //OBTENER POR ID
        Producto producto = productoDAO.obtenerProducto(nuevoProducto.getIdProducto());
        if (producto != null) {
            System.out.println("Producto encontrado: " + producto);

            // Ejemplo de actualización
            producto.setPrecio(949.99);
            producto.setCantidad(8);
            productoDAO.actualizarProducto(producto);
            System.out.println("Producto actualizado");

            // Verificar actualización
            producto = productoDAO.obtenerProducto(producto.getIdProducto());
            System.out.println("Producto despuEs de actualizar: " + producto);
        }
        // OBTENER TODOS LOS PRODUCTOS
        List<Producto> productos = productoDAO.obtenerTodosProductos();
        System.out.println("\nLista de todos los productos:");
        for (Producto p : productos) {
            System.out.println(p);
        }
        // Ejemplo de eliminación
        productoDAO.eliminarProducto(nuevoProducto.getIdProducto());
        System.out.println("Producto eliminado");
    }
}
