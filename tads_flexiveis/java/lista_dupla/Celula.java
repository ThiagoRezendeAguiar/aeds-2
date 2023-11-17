package tads_flexiveis.java.lista_dupla;

public class Celula {
    private Celula ant, prox;
    private int elemento;

    public Celula() {
        this(0);
    }

    public Celula(int elemento) {
        this.ant = this.prox = null;
        this.elemento = elemento;
    }

    public Celula getAnt() {
        return this.ant;
    }

    public Celula getProx() {
        return this.prox;
    }

    public int getElemento() {
        return this.elemento;
    }

    public void setAnt(Celula ant) {
        this.ant = ant;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}
