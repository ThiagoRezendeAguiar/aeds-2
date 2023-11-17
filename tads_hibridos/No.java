public class No {
    private int elemento;
    private No esquerda;
    private No direita;

    public No() {
        this(0);
    }

    public No(int elemento) {
        this.elemento = elemento;
        this.esquerda = null;
        this.direita = null;
    }

    public int getElemento(){
        return this.elemento;
    }

    public No getEsq(){
        return this.esquerda;
    }

    public No getDir(){
        return this.direita;
    }

    public void setElemento(int elemento){
        this.elemento = elemento;
    }

    public void setEsq(No esquerda){
        this.esquerda = esquerda;
    }

    public void setDir(No direita){
        this.direita = direita;
    }
}