package GestUsu;

import Suscripcion.Plan;

public class Usuario {
    String nombre_completo;
    String correo;
    Plan plan;

    public Usuario(String nombre_completo, String correo, Plan plan) {
        this.nombre_completo = nombre_completo;
        this.correo = correo;
        this.plan = plan;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
