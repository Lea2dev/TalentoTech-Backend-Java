import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cli1 = new Cliente("Juan Perez","jpmail@mimail.com");
        Cliente cli2 = new Cliente("Marcela Gutierrez","mgmail@mimail.com");

        Producto prod1 = new Producto("Queso", 3130.20, 200);
        Producto prod2 = new Producto("Manteca", 310.02, 25);
        Producto prod3 = new Producto("Hamburguesas", 5180.12, 255);

        prod1.mostrarInformacion();

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }

        System.out.println("== Aplico descuento ==");
        productos.get(2).aplicarDescuento(10);
        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }

        System.out.println("\nClientes:\n========");
        System.out.println(cli1.toString());
        System.out.println(cli2.toString());

    }
}
