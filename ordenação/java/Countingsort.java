package ordenação.java;

public class Countingsort extends Array {
    public Countingsort(int tamanho) {
        super(tamanho);
    }

    public int getMaior() {
        int maior = array[0];

        for (int i = 0; i < n; i++) {
            if (maior < array[i]) {
                maior = array[i];
            }
        }
        return maior;
    }

    @Override
    public void sort() {
        int[] count = new int[getMaior() + 1];
        int[] ordenado = new int[n];

        for (int i = 0; i < count.length; count[i] = 0, i++);

        for (int i = 0; i < n; count[array[i]]++, i++);

        for (int i = 1; i < count.length; count[i] += count[i - 1], i++);

        for (int i = n - 1; i >= 0; ordenado[count[array[i]] - 1] = array[i], count[array[i]]--, i--);
        
        for(int i = 0; i < n; array[i] = ordenado[i], i++);
    }
}
