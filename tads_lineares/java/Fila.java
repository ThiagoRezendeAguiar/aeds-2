package tads_lineares.java;

public class Fila {
    // Atributos
    private int[] array;
    private int n;

    // Construtor
    public Fila(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    // Método de Inserção
    public void inserir(int num) throws Exception {
        if(n >= array.length){
            throw new Exception("Array Cheio");
        } else {
            array[n] = num;
            n++;
        }
    }

    // Método de Remoção
    public void remover() throws Exception{
        if(n == 0) {
            throw new Exception("Array Vazio");
        } else {
            n--;
            for (int i = 0; i < n; i++){
                array[i] = array[i + 1];
            }
        }
    }

    // Método de Exibição
    public void imprimir() {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
