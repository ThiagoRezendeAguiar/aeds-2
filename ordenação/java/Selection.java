package ordenação.java;

public class Selection extends Array{

    public Selection(int tamanho){
        super(tamanho);
    }

    @Override
    public void sort(){
        int menor;
        for(int i = 0; i < n - 1; i++){
            menor = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[menor]){
                    menor = j;
                }
            }
            swap(i,menor);
        }
    }
}