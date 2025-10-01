public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============== Bienvenido a TienditaOnline");
        Cliente persona1 = new Cliente("Pepe", "pepe@pepeonline.com");
        Carrito chango = new Carrito(persona1);
        Producto prod1 =new Producto("Harna", 1526.50, 3);
        Producto prod2 =new Producto("Pan", 1260.12, 1);
        Producto prod3 =new Producto("Leche", 1230.10, 6);

        chango.agregarProductos(prod1);
        chango.agregarProductos(prod2);
        chango.agregarProductos(prod3);

        System.out.println(chango.toString());
        //System.out.println(chango.getTotal()); // lo incluyo en el toString() de Carrito
    }
}
