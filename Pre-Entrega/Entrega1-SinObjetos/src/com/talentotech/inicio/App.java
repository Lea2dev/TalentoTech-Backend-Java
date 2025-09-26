package com.talentotech.inicio;
public class App {
    public static void main(String[] args) throws Exception {
        // inicializo entorno creando usuarios y articulos


        Usuario usr = new Usuario(1, "Leandro", "asdfñlkj");

        System.out.println("Bienvenido usuario: " + usr.getUserName());

    }
}
