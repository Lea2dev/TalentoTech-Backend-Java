public class App {
    public static void main(String[] args) throws Exception {
        mostrarMensaje("Fin de práctica");
        mostrarMensaje("Fin de práctica", 5);
    }

    private static void mostrarMensaje(String mensaje, int espacios) {
        // TODO Auto-generated method stub
        for(int i=0;i<espacios;i++)
            System.out.print(" ");
        System.out.println(mensaje);
    }
    private static void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        System.out.println(mensaje);
    }

}
