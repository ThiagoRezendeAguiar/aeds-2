package tads_flexiveis.java.lista_simples;

import tads_flexiveis.java.Celula;

public class Lista {
    private Celula primeiro, ultimo;
    private int n;

    public Lista() {
        this.primeiro = this.ultimo = new Celula();
        this.n = 0;
    }

    public void inserirInicio(int num) {
        Celula aux = new Celula(num);
        aux.setProx(primeiro.getProx());
        primeiro.setProx(aux);
        if (primeiro == ultimo) {
            ultimo = aux;
        }
        aux = null;
        n++;
    }

    public void inserir(int pos, int num) throws Exception {
        if (pos < 0 || pos >= n) {
            throw new Exception("Posição Inválida");
        } else if (pos == 0) {
            inserirInicio(num);
        } else if (pos == n - 1) {
            inserirFim(num);
        } else {
            Celula i = primeiro;
            for (int j = 0; j < pos; j++, i = i.getProx())
                ;
            Celula aux = new Celula(num);
            aux.setProx(i.getProx());
            i.setProx(aux);
            aux = i = null;
            n++;
        }

    }

    public void inserirFim(int num) {
        ultimo.setProx(new Celula(num));
        ultimo = ultimo.getProx();
        n++;
    }

    public void removerInicio() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Lista Vazia");
        }

        Celula aux = primeiro;
        primeiro = primeiro.getProx();
        aux.setProx(null);
        aux = null;
        n--;
    }

    public void remover(int pos) throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Lista Vazia");
        } else if (pos < 0 || pos >= n) {
            throw new Exception("Posição Inválida");
        } else if (pos == 0) {
            removerInicio();
        } else if (pos == n - 1) {
            removerFim();
        } else {
            Celula i = primeiro;
            for (int j = 0; j < pos; j++, i = i.getProx())
                ;
            Celula aux = i.getProx();
            i.setProx(aux.getProx());
            aux.setProx(null);
            aux = i = null;
            n--;
        }
    }

    public void removerFim() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Lista Vazia");
        }
        Celula i;
        for (i = primeiro; i != ultimo; i = i.getProx())
            ;
        ultimo = i;
        ultimo.setProx(null);
        i = null;
        n--;
    }

    public void mostrar() {
        for (Celula i = primeiro.getProx(); i != null; i = i.getProx()) {
            System.out.println(i.getElemento() + " ");
        }
    }

    public boolean pesquisar(int num) {
        boolean resp = false;

        for (Celula i = primeiro.getProx(); i != null; i = i.getProx()) {
            if (i.getElemento() == num) {
                resp = true;
                i = null;
            }
        }

        return resp;
    }
}
