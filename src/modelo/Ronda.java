package modelo;

import java.util.Date;
import java.util.List;

public class Ronda {

    private List<Pregunta> preguntas;

    public Ronda() {
    }

    public Ronda(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
