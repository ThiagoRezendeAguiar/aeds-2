package tads_flexiveis.java.pilha;

import tads_flexiveis.java.Celula;

public class Pilha{
    private Celula topo;

    public Pilha (){
       this.topo = null;
    }

    public void inserir(int num){
        Celula aux = new Celula(num);
        aux.setProx(topo);
        topo = aux;
        aux = null;
    }

    public void remover() throws Exception{
        if(topo == null)
          throw new Exception("Pilha Vazia");

        Celula aux = topo;
        topo = topo.getProx();
        aux.setProx(null);
        aux = null;
    }

    public void mostrar(){
        for(Celula i = topo; i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.println();
    }


}