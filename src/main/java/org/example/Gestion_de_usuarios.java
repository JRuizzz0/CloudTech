package org.example;

import GestUsu.Usuario;
import Suscripcion.*;
import recursos.InvalidUsuarioException;

import java.util.ArrayList;

public class Gestion_de_usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();


    public boolean registrarUsuarios(String nombre, String correo, int numPlan) {
        if (buscarUsuario(nombre) != null) return false;
        Plan plan = asignarPlan(numPlan);
        if (plan == null) return false;

        return usuarios.add(new Usuario(nombre, correo, plan));
    }


    public boolean cambiarPlan(String nombre, int nuevoNumPlan) {
        Usuario u = buscarUsuario(nombre);
        Plan nuevoPlan = asignarPlan(nuevoNumPlan);
        if (u != null && nuevoPlan != null) {
            u.setPlan(nuevoPlan);
            return true;
        }
        return false;
    }


    public int consultarVelocidad(String nombre) throws InvalidUsuarioException {
        Usuario u = buscarUsuario(nombre);
        if (u == null) {
            throw new InvalidUsuarioException("Error: El usuario '" + nombre + "' no existe.");
        }
        if (u.getPlan() == null) {
            throw new InvalidUsuarioException("Error: El usuario no tiene un plan asignado.");
        }
        return u.getPlan().getVelocidad();
    }


    public boolean comprobarPlan(String nombre) {
        Usuario u = buscarUsuario(nombre);
        return (u != null && u.getPlan() != null);
    }


    public Usuario buscarUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre_completo().equalsIgnoreCase(nombre)) return u;
        }
        return null;
    }


    public ArrayList<Usuario> listarUsuarios() {
        return this.usuarios;
    }


    private Plan asignarPlan(int opcion) {
        return switch (opcion) {
            case 1 -> new Basic();
            case 2 -> new Advance();
            case 3 -> new Premium();
            default -> null;
        };
    }
}