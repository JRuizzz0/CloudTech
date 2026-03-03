package Suscripcion;

public abstract class Plan {
    int velocidad;
    int limite_de_partidas;

    public Plan(int velocidad, int limite_de_partidas) {
        this.velocidad = velocidad;
        this.limite_de_partidas = limite_de_partidas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getLimite_de_partidas() {
        return limite_de_partidas;
    }

    public void setLimite_de_partidas(int limite_de_partidas) {
        this.limite_de_partidas = limite_de_partidas;
    }
}
