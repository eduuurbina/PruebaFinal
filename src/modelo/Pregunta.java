package modelo;

import java.util.List;

public class Pregunta {

    private Categoria categoria;
    private List<String> respuestas;
    private String desPregunta;
    private String resCorrecta;

    public Pregunta() {
    }

    public Pregunta(Categoria categoria, List<String> respuestas, String desPregunta, String resCorrecta) {
        this.categoria = categoria;
        this.respuestas = respuestas;
        this.desPregunta = desPregunta;
        this.resCorrecta = resCorrecta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    public String getDesPregunta() {
        return desPregunta;
    }

    public void setDesPregunta(String desPregunta) {
        this.desPregunta = desPregunta;
    }

    public String getResCorrecta() {
        return resCorrecta;
    }

    public void setResCorrecta(String resCorrecta) {
        this.resCorrecta = resCorrecta;
    }
}
