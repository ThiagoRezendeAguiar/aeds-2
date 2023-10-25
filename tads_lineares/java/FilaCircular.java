package tads_lineares.java;

public class FilaCircular {
    // Atributos
    private int[] array;
    private int inicio;
    private int fim;

    // Construtor
    public FilaCircular(int tamanho) {
        array = new int[tamanho + 1];
        inicio = fim = 0;
    }

    // Método de Inserção
    public void inserir(int num) throws Exception {
        if ((fim + 1) % array.length == inicio) {
            throw new Exception("Array Cheio");
        } else {
            array[fim] = num;
            fim = (fim + 1) % array.length;
        }
    }

    // Método de Remoção
    public void remover() throws Exception {
        if (fim == inicio) {
            throw new Exception("Array Vazio");
        } else {
            inicio = (inicio + 1) % array.length;
        }
    }

      // Método de Exibição
      public void imprimir() {
        System.out.print("[ ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
