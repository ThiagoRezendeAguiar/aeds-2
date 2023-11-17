package tads_lineares.java;

public class Lista {
    // Atributos
    private int array[];
    private int n;
    
    // Construtores
    public Lista() {
        this(10);
    }

    public Lista(int tamanho) {
        this.n = 0;
        array = new int[tamanho];
    }

    // Métodos de Inserção
    public void inserirInicio(int num) throws Exception {
        if (n >= array.length) {
            throw new Exception("Array Cheio");
        } else {

            for (int i = n; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = num;
            n++;
        }
    }

    public void inserirFim(int num) throws Exception {
        if (n >= array.length) {
            throw new Exception("Array Cheio");
        } else {

            array[n] = num;
            n++;

        }
    }

    public void inserir(int num, int pos) throws Exception {
        if (n >= array.length) {
            throw new Exception("Array Cheio");
        } else if (pos < 0 || pos > n) {
            throw new Exception("Posição Inválida");
        } else {

            for (int i = n; i > pos; i--) {
                array[i] = array[i - 1];
            }

            array[pos] = num;
            n++;

        }
    }

    // Métodos de Remoção
    public void removerInicio() throws Exception {
        if (n == 0) {
            throw new Exception("Array Vazio");
        } else {

            n--;
            for (int i = 0; i < n; i++) {
                array[i] = array[i + 1];
            }

        }
    }

    public void removerFim() throws Exception {
        if (n == 0) {
            throw new Exception("Array Vazio");
        } else {

            n--;

        }
    }

    public void remover(int pos) throws Exception {
        if (n == 0) {
            throw new Exception("Array Vazio");
        } else if (pos < 0 || pos >= n) {
            throw new Exception("Posição inválida");
        } else {

            n--;
            for (int i = pos; i < n; i++) {
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