package ordenação.java;

public class Shellsort extends Array {
    public Shellsort(int tamanho) {
        super(tamanho);
    }

    @Override
    public void sort() {
        int h = 1;
        do {
            h = (h * 3) + 1;
        } while (h < n);

        do{ 
            h /= 3;
            for(int cor = 0; cor < h; cor++){
                shellsort(cor, h);
            }
        } while (h != 1);
    }

    private void shellsort(int cor, int h){
        int aux;
        int j;
        for(int i = (cor + h); i < n; i += h){
            aux = array[i];
            for(j = i - h; (j >= 0) && (array[j] > aux); j -= h){
                array[j + h] = array[j];
            }
            array[j + h] = aux;
        }
    }

}
