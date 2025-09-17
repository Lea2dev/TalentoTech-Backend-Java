public class App {
    public static void main(String[] args) throws Exception {
        /*
        Mas métodos en la misma clase
            Agregá un método en Producto que calcule un descuento general para todos los productos de un 10%.
            Probalo con distintos precios.
         */
        Producto prod1 = new Producto("Queso", 3130.20, 200);
        Producto prod2 = new Producto("Manteca", 310.02, 25);
        Producto prod3 = new Producto("Hamburguesas", 5180.12, 255);

        System.out.println(prod1.toString()); //solo toString
        System.out.println(prod2.toString()); //solo toString
        prod3.mostrarInformacion(); // uso el metodo como alternativa

    }
}
