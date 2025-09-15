public class Arrays {
    public static void main(String[] args) throws Exception {
        System.out.println("\nArrays -----------------------------------------------");
        String productos[] = new String[5];
        productos[0]= "Te negro";
        productos[1]= "Te verde";
        productos[2]= "Te en hebras";
        productos[3]= "Café";
        productos[4]= "Mate cocido";
        //muestro array
        for(String prod:productos){
            System.out.println(prod);
        }
        
        // un sexto articulo dará error
        // productos[5]= "Edulcorante";
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

    }
}
