public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============== Bienvenido a TienditaOnline ===============");
        Cliente persona1 = new Cliente("Pepe", "pepe@pepeonline.com");
        Carrito chango = new Carrito(persona1);
        Producto prod1 =new Producto("Harna", 1526.50, 3);
        Producto prod2 =new Producto("Pan", 1260.12, 1);
        Producto prod3 =new Producto("Leche", 1230.10, 6);
        

        chango.agregarProductos(prod1);
        chango.agregarProductos(prod2);
        chango.agregarProductos(prod3);

        System.out.print("Cantidad de productos agregados: ");
        System.out.println(Producto.getContadorProductos());
        System.out.println(prod3.getDescripcion());
        System.out.println(prod3.getStock());
        prod3.setStock(-3);  // intento modificar negativo
        System.out.println(prod3.getStock()); // verifico que no se modifique
        prod3.setStock(7);  // modifico
        System.out.println(prod3.getStock()); // verifico que se actualize ok
    }
}
