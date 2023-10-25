package ordenação.java;

public class Insertion extends Array{
    public Insertion(int tamanho){
        super(tamanho);
    }

    @Override
    public void sort(){
        int aux;
        int j;
        for(int i = 1; i < n; i++){
            aux = array[i];
            for(j = i - 1; (j >= 0) && (array[j] > aux); j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = aux;
        }
    }
}
