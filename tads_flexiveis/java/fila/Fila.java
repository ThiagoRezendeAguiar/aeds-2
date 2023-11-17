package tads_flexiveis.java.fila;

import tads_flexiveis.java.Celula;

public class Fila {
    private Celula primeiro;
    private Celula ultimo;

    public Fila(){
        this.primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserir(int num){
      ultimo.setProx(new Celula(num));
      ultimo = ultimo.getProx();
    }

    public void remover()throws Exception{
        if(primeiro == ultimo)
            throw new Exception("Fila Vazia");

        Celula aux = primeiro;
        primeiro = primeiro.getProx();
        primeiro.setElemento(0);
        aux.setProx(null);
        aux = null;
    }

    public int getMaior() throws Exception{
        if(primeiro == ultimo)
            throw new Exception("Fila Vazia");
        int maior = primeiro.getProx().getElemento();
        for(Celula i = primeiro.getProx(); i != null; i = i.getProx()){
            if(i.getElemento() > maior){
                maior = i.getElemento();
            }
        }
        return maior;
    }

    public void mostrar(){
        for(Celula i = primeiro.getProx(); i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.println();
    }


}
