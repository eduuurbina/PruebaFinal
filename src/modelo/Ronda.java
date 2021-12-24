package modelo;

import java.util.Date;
import java.util.List;

public class Ronda {

    private int idRonda;
    private List<Pregunta> preguntas;

    public Ronda() {
    }

    public Ronda(int idRonda, List<Pregunta> preguntas) {
        this.idRonda = idRonda;
        this.preguntas = preguntas;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }
}
