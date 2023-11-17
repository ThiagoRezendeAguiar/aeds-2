package tads_flexiveis.java.binary_tree;

public class No{
    private No esq;
    private No dir;
    private int elemento;

    public No(int elemento){
        this.esq = this.dir = null;
        this.elemento = elemento;
    }

    public No getEsq(){
        return this.esq;
    }

    public No getDir(){
        return this.dir;
    }

    public int getElemento(){
        return this.elemento;
    }

    public void setEsq(No esq){
        this.esq = esq;
    }

    public void setDir(No dir){
        this.dir = dir;
    }

    public void setElemento(int elemento){
        this.elemento = elemento;
    }
}