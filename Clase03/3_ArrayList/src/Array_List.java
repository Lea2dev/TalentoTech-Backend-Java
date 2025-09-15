import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) throws Exception {
        System.out.println("\nArrayList --------------------------------------------");
        ArrayList<String> prodArray = new ArrayList<>();
        prodArray.add("Te negro en array");
        prodArray.add("Te verde en array");
        prodArray.add("Te en hebras en array");
        prodArray.add("Café en array");  // indice 3, el que voy a quitar
        prodArray.add("Mate cocido en array");
        //muestro arrayList
        System.out.println(prodArray.toString()); // muestro sin formato
        //eliminio el item 3 y muestro de nuevo
        prodArray.remove(3);
        System.out.println(prodArray.toString()); 

    }
}
