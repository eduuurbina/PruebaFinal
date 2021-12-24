package modelo;

import java.util.List;

public class Juego {

    private Jugador jugador;
    List<Ronda> rondas;
    private int puntaje;

    public Juego() {
    }

    public Juego(Jugador jugador, List<Ronda> rondas, int puntaje) {
        this.jugador = jugador;
        this.rondas = rondas;
        this.puntaje = puntaje;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public List<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(List<Ronda> rondas) {
        this.rondas = rondas;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
