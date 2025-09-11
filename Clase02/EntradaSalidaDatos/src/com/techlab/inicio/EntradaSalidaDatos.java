package com.techlab.inicio;
import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void main(String[] args) throws Exception {
        double precio = 10.5;
        int cantidad;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresar cantidad:");
        cantidad= sc.nextInt();
        System.out.println("Perfecto " + nombre + ", este es el total:");
        System.out.println(cantidad*precio);
        sc.close();
    }
}
