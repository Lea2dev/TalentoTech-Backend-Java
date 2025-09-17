public class App {
    public static void main(String[] args) throws Exception {
        /*
        Constructores
            Creá un constructor para Cliente que reciba el nombre y email.
            Crea varios clientes con este constructor y mostrálos por pantalla.
         */

         
        Cliente cli1 = new Cliente("Juan Perez","jpmail@mimail.com");
        Cliente cli2 = new Cliente("Marcela Gutierrez","mgmail@mimail.com");

        System.out.println("Clientes:");
        System.out.println("Nombre: " + cli1.getNombre()); // parte de la info del objeto
        System.out.println(cli2.toString()); // tostring del objeto
    }
}
