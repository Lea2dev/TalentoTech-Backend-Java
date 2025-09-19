public class App {
    public static void main(String[] args) throws Exception {
        String day = "monday";

        for (int i = 0; i < day.length(); i++) {
            char letra = day.charAt(i);
            if ("aeiou".contains(Character.toString(letra))) {
                System.out.println(Character.toUpperCase(letra));
            } else {
                System.out.println(letra);
            }
        }

    String diasDescuento[] = { "Lunes" };

    }
}
