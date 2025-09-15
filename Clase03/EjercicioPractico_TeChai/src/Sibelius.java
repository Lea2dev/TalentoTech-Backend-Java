import java.util.ArrayList;

import javax.swing.JSpinner.ListEditor;

public class Sibelius {
    public static void main(String[] args) throws Exception {

        String producto = "";

        System.out.println("1. Manipulación de cadenas ------------------------------");
        producto = "  te CHAi  ";
        System.out.println("Dato ingresado: "+producto);
        producto = producto.trim();
        producto = producto.toLowerCase();
        // producto = Character.toUpperCase(producto.charAt(0))+ producto.substring(1);  // esto solo es para colocar una mayúscula al comienzo solamente
        char[] letras= producto.toCharArray();  //asigno cadena a array tipo char
        producto=""; // limpio cadena
        char letraAnterior='-'; // asigno valor falso
        for (int i =0; i<letras.length ; i++){ // recorro, evaluo si el caracter anterior es espacio, entonces reemplazo con toUpperCase
            if (i==0 || letraAnterior == ' ')
                producto += Character.toString(Character.toUpperCase(letras[i]));
            else
                producto += Character.toString(letras[i]);
            letraAnterior = letras[i];  // asigno letra actual para ser evaluada como próxima "letra anterior"
        } 
        System.out.println("Dato corregido: " + producto);
        System.out.println("Longitud de cadena ingresada: " + producto.length());
        System.out.println("Primera letra: " + producto.charAt(0));
        System.out.println("Contiene 'Chai'? " + (producto.contains("Chai") ? "Si" : "No") );

        System.out.println("\n2. Arrays -----------------------------------------------");
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

        System.out.println("\n3. ArrayList --------------------------------------------");
        ArrayList<String> prodArray = new ArrayList<>();
        prodArray.add("Te negro en array");
        prodArray.add("Te verde en array");
        prodArray.add("Te en hebras en array");
        prodArray.add("Café en array");
        prodArray.add("Mate cocido en array");
        //muestro arrayList
        System.out.println(prodArray.toString()); // muestro sin formato
        //muestro arrayList de dos maneras
        //recorriendo
        for(String prod:prodArray){
            System.out.println(prod);
        }
        System.out.println("--");
        //por streams
        prodArray.forEach(System.out::println);

        System.out.println("\n4. Combinar cadenas y listas ----------------------------");
        ArrayList<String> prodArray2 = new ArrayList<>();
        prodArray2.add("   tE nEGro EN array2");
        prodArray2.add("Te verde eN aRRay2     ");
        prodArray2.add("   Te en hebras en array2   ");
        prodArray2.add(" CAfÉ en aRraY2");
        prodArray2.add("  MaTE cOcido en array2    ");
        //prodArray2.forEach(System.out::println);
//imprimo tal cual original
        System.out.println("----------- Imprimo inicial ---------");
        System.out.println(prodArray2.toString());

        for(int i=0 ; i<prodArray2.size() ; i++){
            String prod2 = prodArray2.get(i);
            //System.out.println(prod2);  // lo muestro tal cual, desordenado
            char letraAnt='-'; // asigno valor falsoTe Chai
            prod2 = prod2.toLowerCase(); // dejo todo en minúsculas
            prod2 = prod2.trim(); // dejo todo en minúsculas
            char[] letras2= prod2.toCharArray();  //asigno cadena a un array tipo char
            prod2=""; // limpio el contenido del nodo de prodArray2
            for (int j=0; j<letras2.length ; j++){ // recorro, evaluo si el caracter anterior es espacio, entonces reemplazo con toUpperCase
                if (j==0 || letraAnt == ' ')
                    prod2 += Character.toString(Character.toUpperCase(letras2[j]));
                else
                    prod2 += Character.toString(letras2[j]);
                letraAnt = letras2[j];  // asigno letra actual para ser evaluada como próxima "letra anterior"
            } 
            //System.out.println(prod);
            prodArray2.set(i, prod2);
        }

        System.out.println(prodArray2.toString());
    }
}

