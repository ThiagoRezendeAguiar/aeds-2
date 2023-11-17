package tads_flexiveis.java.binary_tree;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Inserção
    public void inserir(int num) throws Exception {
        this.raiz = inserir(num, raiz);
    }

    private No inserir(int num, No i) throws Exception {
        if (i == null) {
            i = new No(num);
        } else if (num < i.getElemento()) {
            i.setEsq(inserir(num, i.getEsq()));
        } else if (num > i.getElemento()) {
            i.setDir(inserir(num, i.getDir()));
        } else {
            throw new Exception("Número Repetido");
        }

        return i;
    }

    public void inserirPai(int num) throws Exception {
        if (raiz == null) {
            raiz = new No(num);
        } else if (num < raiz.getElemento()) {
            inserirPai(num, raiz.getEsq(), raiz);
        } else if (num > raiz.getElemento()) {
            inserirPai(num, raiz.getDir(), raiz);
        } else {
            throw new Exception("Número Repetido");
        }
    }

    private void inserirPai(int num, No i, No pai) throws Exception {
        if (i == null) {
            if (num < pai.getElemento()) {
                pai.setEsq(new No(num));
            } else {
                pai.setDir(new No(num));
            }
        } else if (num < i.getElemento()) {
            inserirPai(num, i.getEsq(), i);
        } else if (num > i.getElemento()) {
            inserirPai(num, i.getDir(), i);
        } else {
            throw new Exception("Númeor Repetido");
        }
    }

    // Remoção
    public void remover(int num) throws Exception {
        raiz = remover(num, raiz);
    }

    private No remover(int num, No i) throws Exception {
        if (i == null) {
            throw new Exception("Árvore Vazia");
        } else if (num < i.getElemento()) {
            i.setEsq(remover(num, i.getEsq()));
        } else if (num > i.getElemento()) {
            i.setDir(remover(num, i.getDir()));
        } else if (i.getDir() == null) {
            i = i.getEsq();
        } else if (i.getEsq() == null) {
            i = i.getDir();
        } else {
            i.setEsq(maiorEsq(i, i.getEsq()));
        }

        return i;
    }

    // Pesquisa
    public boolean pesquisar(int num) {
        return pesquisar(num, raiz);
    }

    private boolean pesquisar(int num, No i) {
        boolean resp = false;

        if (i.getElemento() == num) {
            resp = true;
        } else if (num < i.getElemento()) {
            resp = pesquisar(num, i.getEsq());
        } else if (num > i.getElemento()) {
            resp = pesquisar(num, i.getDir());
        }

        return resp;
    }

    // Caminhamento
    public void caminharCentral(No i) { // Central ou em ordem
        if (i != null) {
            caminharCentral(i.getEsq());
            System.out.print(i.getElemento() + " ");
            caminharCentral(i.getDir());
        }
    }

    public void caminharPos(No i) { // Pós-fixado ou pós-ordem
        if (i != null) {
            caminharPos(i.getEsq());
            caminharPos(i.getDir());
            System.out.print(i.getElemento() + " ");
        }
    }

    public void caminharPre(No i) { // Pré-fixado ou pré-ordem
        if (i != null) {
            System.out.print(i.getElemento() + " ");
            caminharPre(i.getEsq());
            caminharPre(i.getDir());
        }
    }

    public int getMaior() {
        int resp = -1;
        if (raiz != null) {
            No i;
            for (i = raiz; i.getDir() != null; i = i.getDir())
                ;
            resp = i.getElemento();
        }

        return resp;
    }

    public int getMenor() {
        int resp = -1;
        if (raiz != null) {
            No i;
            for (i = raiz; i.getEsq() != null; i = i.getEsq())
                ;
            resp = i.getElemento();
        }

        return resp;
    }

    private No maiorEsq(No i, No j) {
        if(j.getDir() == null){
            i.setElemento(j.getElemento());
            j = j.getEsq();
        } else {
            j.setDir(maiorEsq(i, j.getDir()));
        }

        return j;
    }

    public int getAltura(){
        return getAltura(raiz, 0);
    }

    private int getAltura(No i, int altura){
        if (i == null){
            altura--;
        } else {
            int alturaEsq = getAltura(i.getEsq(), altura + 1);
            int alturaDir = getAltura(i.getDir(), altura + 1);
            altura = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
        }

        return altura;
    }
}
