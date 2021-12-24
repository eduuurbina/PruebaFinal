package modelo;

public class Categoria {

    private int numDifcultad;
    private String difcultad;

    public Categoria() {
    }

    public Categoria(int numDifcultad, String difcultad) {
        this.numDifcultad = numDifcultad;
        this.difcultad = difcultad;
    }

    public int getNumDifcultad() {
        return numDifcultad;
    }

    public void setNumDifcultad(int numDifcultad) {
        this.numDifcultad = numDifcultad;
    }

    public String getDifcultad() {
        return difcultad;
    }

    public void setDifcultad(String difcultad) {
        this.difcultad = difcultad;
    }
}
