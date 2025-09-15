import java.util.ArrayList;

public class CombinarCadenasListas {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> nombreArray = new ArrayList<>();
        nombreArray.add("   juan mANUEL");
        nombreArray.add(" GILBertO   ");
        nombreArray.add("   claUDIA ferNanDA   ");
        nombreArray.add("PatrICIA       ");
        nombreArray.add("  aDALBerto    ");
        //nombreArray.forEach(System.out::println);
        //imprimo tal cual original
        System.out.println("----------- Imprimo inicial ---------");
        System.out.println(nombreArray.toString());

        for(int i=0 ; i<nombreArray.size() ; i++){
            String nombre = nombreArray.get(i);
            //System.out.println(nombre);  // lo muestro tal cual, desordenado
            char letraAnt='-'; // asigno valor falsoTe Chai
            nombre = nombre.toLowerCase(); // dejo todo en minúsculas
            nombre = nombre.trim(); // dejo todo en minúsculas
            char[] letras2= nombre.toCharArray();  //asigno cadena a un array tipo char
            nombre=""; // limpio el contenido del nodo de nombreArray
            for (int j=0; j<letras2.length ; j++){ // recorro, evaluo si el caracter anterior es espacio, entonces reemplazo con toUpperCase
                if (j==0 || letraAnt == ' ')
                    nombre += Character.toString(Character.toUpperCase(letras2[j]));
                else
                    nombre += Character.toString(letras2[j]);
                letraAnt = letras2[j];  // asigno letra actual para ser evaluada como próxima "letra anterior"
            } 
            nombreArray.set(i, nombre);
        }

        nombreArray.sort(null); // ordeno
        System.out.println(nombreArray.toString()); // muestro

    }
}
