import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        short descuento = 5;
        short cantidad = 52;
        double importe = 1532.53;
        double importeFinal = calcularPrecioFinal(importe, descuento, cantidad);
        System.out.println("\nImporte final calculado con descuento si corresponde: " + importeFinal);
        System.out.format(Locale.forLanguageTag("es-AR"), "$ %.2f", importeFinal);
    }
    private static Double calcularPrecioFinal(Double importe, short descuento, short cantidad) {
        if(cantidad>50)
            return (importe-(importe*descuento/100))*cantidad;
        else
            return importe*cantidad;
    
    }    
}
