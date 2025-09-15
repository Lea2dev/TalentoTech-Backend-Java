import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// PARTE 1
        System.out.println("Ingrese un importe");
        Scanner sc = new Scanner(System.in);
        Double importe = sc.nextDouble();
        double impuesto = 21.0;
        Double importeFinal = calcularImpuesto(importe,impuesto);
        System.out.format(Locale.forLanguageTag("es-AR"), "%.2f", importeFinal);
// PARTE 2
        short descuento = 5;
        short cantidad = 52;
        importeFinal = calcularPrecioFinal(importe, descuento, cantidad);
        System.out.println("\nImporte final calculado con descuento si corresponde: " + importeFinal);
// PARTE 3
        ArrayList<Producto> stock = new ArrayList<>();
        stock.add(new Producto("Mermelada", 1526.50, 30));
        stock.add(new Producto("Leche entera", 2326.50, 60));
        stock.add(new Producto("Huevos 6u", 4560.20, 300));
        System.out.println("Stock vigente:");
        for (Producto producto : stock) {
            System.out.println(producto.toString());
        }
        reponerStock(stock.get(2),50);
        System.out.println("Stock actualizado:");
        for (Producto producto : stock) {
            System.out.println(producto.toString());
        }
// PARTE 4
        mostrarMensaje("Fin de práctica");
        mostrarMensaje("Fin de práctica", 5);

        sc.close();
    }

// PARTE 4 funciones
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

// PARTE 3 funciones    
    private static void reponerStock(Producto producto, int cantidadIncrementar) {
        // TODO Auto-generated method stub
        int cantidadActual = producto.getStock(); // podría hacerse todo en 1 línea...
        producto.setStock(cantidadActual+cantidadIncrementar);
    }

// PARTE 2 funciones
    private static Double calcularPrecioFinal(Double importe, short descuento, short cantidad) {
        // TODO Auto-generated method stub
        if(cantidad>50)
            return (importe-(importe*descuento/100))*cantidad;
        else
            return importe*cantidad;
        
        //throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioFinal'");
    }
// PARTE 1 funciones
    private static Double calcularImpuesto(Double importe, double impuesto) {
        // TODO Auto-generated method stub
        return importe*impuesto/100 + importe;
        //throw new UnsupportedOperationException("Unimplemented method 'calcularImpuesto'");
    }
}
