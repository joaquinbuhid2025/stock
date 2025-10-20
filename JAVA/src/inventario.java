import java.util.ArrayList;
public class inventario {
    private ArrayList<Producto> productos;

    public inventario() {
        productos = new ArrayList<>();
        
        productos.add(new producto(1, "Producto 1", 10.0, 10, "Categoria 1", ""));
        productos.add(new producto(2, "Producto 2", 20.0, 20, "Categoria 2", ""));
        productos.add(new producto(3, "Producto 3", 30.0, 30, "Categoria 3", ""));
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
    public void buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre() == nombre) {
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public ArrayList<Producto> getProductos() { return productos; }
}
