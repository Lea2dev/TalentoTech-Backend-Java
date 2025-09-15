import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
                System.out.println("Ingrese un importe");
        Scanner sc = new Scanner(System.in);
        Double importe = sc.nextDouble();
        double impuesto = 21.0;
        Double importeFinal = calcularImpuesto(importe,impuesto);
        System.out.format(Locale.forLanguageTag("es-AR"), "%.2f", importeFinal);
    }

    private static Double calcularImpuesto(Double importe, double impuesto) {
        // TODO Auto-generated method stub
        return importe*impuesto/100 + importe;
        //throw new UnsupportedOperationException("Unimplemented method 'calcularImpuesto'");
    }

}
