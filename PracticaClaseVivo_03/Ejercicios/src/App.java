import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo desde Java!");
        // Creamos un objeto Scanner para leer la entrada del usuario
        //Tipo de dato del objeto  nombre = new(palabra reservada para instanciar un objeto en memoria) constructor de la clase con los parametros que recibe para crear ese objeto en memoria.
        Scanner scanner = new Scanner(System.in);
        // Pedimos al usuario que ingrese un número
        System.out.println("Ingrese un número: ");
        // Leemos el número ingresado por el usuario
        int numero = scanner.nextInt();
        // Imprimimos el número que ingresó el usuario
        System.out.println("El número ingresado es: " + numero);
        // Cerramos el scanner para liberar recursos

/*
 * Crear un programa por consola que le pida al usuario
    nombre
    edad
    altura

 */
        scanner.nextLine();
        String nombre;
        short edad;
        float altura;
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextShort();
        System.out.println("Ingrese su altura: ");
        altura = scanner.nextFloat();

        System.out.println("\n----------------Datos ingresados---------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:" + edad);
        System.out.format(Locale.forLanguageTag("es-AR"), "%.2f", altura);
        System.out.println("\n-----------------------------------------------------");

        scanner.close();
    }
}
