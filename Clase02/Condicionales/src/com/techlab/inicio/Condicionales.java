package com.techlab.inicio;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws Exception {
        double precio = 20.0;
        int cantidad;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresar cantidad:");
        cantidad= sc.nextInt();
        System.out.print("Gracias por el pedido, " + nombre + ", este es el total:");
        if(cantidad>100){
            System.out.print("\nPor pedir mas de 100 unidades, hay un descuento del 10% :");
            System.out.print(cantidad*precio*.9);
            System.out.println("El valor original era de "+(cantidad*precio));
        }else{
            System.out.println(cantidad*precio);
        }
        sc.close();
    }
}
