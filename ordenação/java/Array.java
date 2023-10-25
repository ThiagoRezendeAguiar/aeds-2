package ordenação.java;

import java.util.Random;

public class Array {
    
   protected int[] array;
   protected int n;

    public Array(int tamanho){
        array = new int[tamanho];
        n = array.length;
        aleatorio();
    }

    public void swap(int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public void imprimir(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void aleatorio() {
        Random random = new Random();
        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void sort(){
        // Método implementado nas sub-classes
    }

}
