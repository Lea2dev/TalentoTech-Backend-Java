package com.techlab.inicio;

import java.util.Scanner;

public class VariableOperadores {
    public static void main(String[] args) throws Exception {
        double precio = 10.5;
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad:");
        cantidad= sc.nextInt();
        System.out.println(cantidad*precio);
        sc.close();
    }
}
