package modelo;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private int idJuego;
    private Jugador jugador;
    List<Ronda> rondas;
    private int puntaje;

    public Juego() {
    }

    public Juego(int idJuego, Jugador jugador, List<Ronda> rondas, int puntaje) {
        this.idJuego = idJuego;
        this.jugador = jugador;
        this.rondas = rondas;
        this.puntaje = puntaje;
    }

    public void comienzo(Jugador jugador){
        this.idJuego = 1;
        this.jugador = jugador;
        Ronda ronda = crearRonda();

    }

    public Ronda crearRonda(){
        List respuestas = new ArrayList();
        respuestas.add("Es un lenguaje de programacion");
        respuestas.add("Es un programa");
        respuestas.add("Es un ide");
        respuestas.add("Es un servidor");
        Pregunta pregunta = new Pregunta(1,"facil",respuestas,"Que es java","Es un lenguaje de programacion");
        List<Pregunta> preguntas = new ArrayList<Pregunta>();
        preguntas.add(pregunta);
        Ronda ronda = new Ronda(1,preguntas);
        return ronda;
    }

    public List<Pregunta> llenarPreguntas(){
        return null;
    }

    public List<Pregunta> llenarRespuestas(){
        return null;
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

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }
}
