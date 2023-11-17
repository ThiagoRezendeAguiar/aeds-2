package tads_flexiveis.java.matriz;

public class Matriz {
    private Celula inicio;
    private int linha, coluna;

    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.inicio = new Celula();
        criar(linha, coluna);
    }

    private void criar(int linha, int coluna) {
        Celula i = inicio;
        Celula j;
        for (int k = 1; k < coluna; k++, i = i.dir) {
            i.dir = new Celula();
            i.dir.esq = i;
        }

        i = inicio;
        for(int l = 1; l < linha; l++, i = i.inf){
            i.inf = new Celula();
            j = i.inf;
            i.inf.sup = i;
            for(int c = 0; c < coluna; c++, j = j.dir){
                j.dir = new Celula();
                j.dir.esq = j;
                j.dir.sup = j.sup.dir;
                j.sup.dir.inf = j.dir;
            }
        }
    }

}
