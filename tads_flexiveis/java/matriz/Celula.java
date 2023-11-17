package tads_flexiveis.java.matriz;

public class Celula {
   public Celula sup;
   public Celula inf;
   public Celula esq;
   public Celula dir;
   public int elemento;

    public Celula (){
        this(0);
    }
    
    public Celula (int elemento){
        sup = inf = esq = dir = null;
        this.elemento = elemento;
    }
}