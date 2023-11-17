package tads_flexiveis.java;

public class Celula {
    private int elemento;
    private Celula prox;

    public Celula(){
        this(0);
    }

    public Celula(int elemento){
        this.elemento = elemento;
        this.prox = null;
    }

    public int getElemento (){
        return this.elemento;
    }

    public Celula getProx (){
        return this.prox;
    }

    public void setElemento (int elemento){
        this.elemento = elemento;
    }

    public void setProx(Celula prox){
        this.prox = prox;
    }
}
