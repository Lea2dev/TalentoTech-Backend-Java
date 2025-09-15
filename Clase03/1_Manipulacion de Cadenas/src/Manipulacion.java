public class Manipulacion {
    public static void main(String[] args) throws Exception {
        String producto = "";

        System.out.println("Manipulación de cadenas ------------------------------");
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
    }
}
