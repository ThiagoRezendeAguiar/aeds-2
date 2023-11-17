package ordenação.java;

public class Heapsort extends Array {
    public Heapsort(int tamanho) {
        super(tamanho);
    }

    private void heapfy(int i, int f) {
        int aux = array[i];
        int j = i * 2 + 1;
        while (j <= f) {
            if (j < f) {
                if (array[j] < array[j + 1]) {
                    j = j + 1;
                }
            }
            if (aux < array[j]) {
                array[i] = array[j];
                i = j;
                j = 2 * i + 1;
            } else {
                j = f + 1;
            }
        }
        array[i] = aux;
    }

    @Override
    public void sort() {
        // Construir o heap invertido
        for (int i = (n - 1) / 2; i >= 0; i--) {
            heapfy(i, n - 1);
        }

        for(int i = n - 1; i >= 1; i--){
            swap(0, i);
            heapfy(0, i - 1);
        }
    }
}