package ordenação.java;

public class Quicksort extends Array {
    public Quicksort(int tamanho) {
        super(tamanho);
    }

    @Override
    public void sort(){
        sort(0, n-1);
    }

    public void sort(int esquerda, int direita) {
        int pivo = (esquerda + direita) / 2;
        int i = esquerda;
        int j = direita;

        while (i <= j) {
            while (array[i] < array[pivo]) {
                i++;
            }

            while (array[j] > array[pivo]) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (esquerda < j)
            sort(esquerda, j);

        if (direita > i)
            sort(i, direita);

    }
}
