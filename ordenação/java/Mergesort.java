package ordenação.java;

public class Mergesort extends Array {
    public Mergesort(int tamanho) {
        super(tamanho);
    }

    private void merge(int esquerda, int meio, int direita) {
        // Definir tamanho dos dois subarrays
        int nEsq = meio - esquerda + 1;
        int nDir = direita - meio;


        int[] arrayEsq = new int[nEsq];
        int[] arrayDir = new int[nDir];

        int i, j, k;

        for(i = 0; i < nEsq; i++){
            arrayEsq[i] = array[esquerda + i];
        }

        for(j = 0; j < nDir; j++){
            arrayDir[j] = array[meio + 1 + j];
        }

        for(i = j = 0, k = esquerda; k <= direita; k++){
            array[k] = (i < nEsq && (j >= nDir || arrayEsq[i] <= arrayDir[j])) ? arrayEsq[i++] : arrayDir[j++];
        }
    }

    @Override
    public void sort(){
        sort(0, n-1);
    }

    private void sort(int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            sort(esquerda, meio);
            sort(meio + 1, direita);
            merge(esquerda, meio, direita);
        }
    }
}
