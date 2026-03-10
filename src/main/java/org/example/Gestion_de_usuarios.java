package org.example;


import GestUsu.Usuario;
import Suscripcion.Advance;
import Suscripcion.Basic;
import Suscripcion.Plan;
import Suscripcion.Premium;
import recursos.MyScanner;

import java.util.ArrayList;

public class Gestion_de_usuarios {

    MyScanner sc = new MyScanner();
    ArrayList<Usuario> usuarios= new ArrayList<Usuario>();

        public void cambiarPlan() {
            String nombre = sc.pedirSoloTexto("Escribe el nombre-completo: ");
            for (Usuario u : usuarios) {
                if (u.getNombre_completo().equals(nombre)) {
                    Plan plan = null;
                    int numPlan = sc.pedirNumero("Ingresa el numero del plan: " +
                            "1- Basic" +
                            "2- Advance" +
                            "3- Premium");

                    if (numPlan == 1) {
                        plan = new Basic();
                    }else if (numPlan == 2) {
                        plan = new Advance();
                    }else if (numPlan == 3) {
                        plan = new Premium();
                    }else {
                        System.out.println("No existe el plan");
                    }
                    u.setPlan(plan);
                }
            }


               }
        public void consultarVelocidad() {

            String nombre = sc.pedirSoloTexto("Escribe el nombre-completo: ");
            for (Usuario u : usuarios) {
                if (u.getNombre_completo().equals(nombre)) {
                    Plan plan = null;
                    int numPlan = sc.pedirNumero("Ingresa el numero del plan: " +
                            "1- Basic" +
                            "2- Advance" +
                            "3- Premium");

                    if (numPlan == 1) {
                        plan = new Basic();
                    }else if (numPlan == 2) {
                        plan = new Advance();
                    }else if (numPlan == 3) {
                        plan = new Premium();
                    }else {
                        System.out.println("No existe el plan");
                    }

                }
            }


              }
        public void comprobarPlan() {

            String nombre = sc.pedirSoloTexto("Escribe el nombre-completo: ");
            for (Usuario u : usuarios) {
                if (u.getNombre_completo().equals(nombre)) {
                    u.getPlan();
                }
                else  {
                    System.out.println("No existe el usuario");
                }
            }

            }
        public void registrarUsuarios() {
           String nombre = sc.pedirSoloTexto("Ingresa el nombre completo: ");
           String correo = sc.pideTexto("Ingresa el correo del usuario: ");

            Plan plan = null;
            int numPlan = sc.pedirNumero("Ingresa el numero del plan: " +
                    "1- Basic" +
                    "2- Advance" +
                    "3- Premium");

            if (numPlan == 1) {
                plan = new Basic();
            }else if (numPlan == 2) {
                plan = new Advance();
            }else if (numPlan == 3) {
                plan = new Premium();
            }else {
                System.out.println("No existe el plan");
            }

            Usuario usuario = new Usuario(nombre,correo,plan);
            System.out.println("El usuario se ha registrado correctamente" + usuario.getCorreo() + " " + usuario.getNombre_completo());


            usuarios.add(usuario);
        }
        public void listarUsuarios(){
            System.out.println((usuarios));

        }
        public String buscarUsuarios() {
            return ""; }
    }