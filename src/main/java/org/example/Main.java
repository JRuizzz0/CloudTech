package org.example;
import recursos.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        Gestion_de_usuarios gestionUs = new Gestion_de_usuarios();


        String nombre = sc.pedirSoloTexto("Nombre: ");
        String correo = sc.pideTexto("Correo: ");
        int plan = sc.pedirNumero("Plan (1-3): ");

        if(gestionUs.registrarUsuarios(nombre, correo, plan)) {
            System.out.println("Guardado con éxito");
        } else {
            System.out.println("Error al guardar");
        }
    }
}