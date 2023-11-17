package tads_flexiveis.java;

import tads_flexiveis.java.fila.Fila;
import tads_flexiveis.java.pilha.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.inserir(5);
        pilha.inserir(4);
        pilha.inserir(9);
        pilha.inserir(10);
        pilha.inserir(25);
        pilha.inserir(11);
        pilha.inserir(1);
        pilha.inserir(3);
        pilha.inserir(8);
        pilha.mostrar();

        try {
            pilha.remover();
            pilha.remover();
            pilha.remover();
            pilha.remover();
            pilha.remover();
            pilha.remover();
        } catch (Exception e) {
            System.err.println(e);
        }

        pilha.mostrar();

        Fila fila = new Fila();
        fila.inserir(5);
        fila.inserir(4);
        fila.inserir(9);
        fila.inserir(10);
        fila.inserir(25);
        fila.inserir(11);
        fila.inserir(1);
        fila.inserir(3);
        fila.inserir(8);
        fila.mostrar();

        try {
            System.out.println(fila.getMaior());
            fila.remover();
            fila.remover();
            fila.remover();
            fila.remover();
            fila.remover();
            fila.remover();
        } catch (Exception e) {
            System.err.println(e);
        }

        fila.mostrar();

    }
}
