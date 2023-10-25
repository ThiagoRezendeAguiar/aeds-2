package pesquisa.java;

public class Pesquisa {

    public boolean sequencial(int[] array, int num){
        boolean resp = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                resp = true;
                break;
            }
        }

        return resp;
    }

    public boolean binaria(int[] array, int num){           // O array deve estar ordenado
        int direita = array.length - 1;
        int esquerda = 0; 
        int meio;
        boolean resp = false;
        
        while(direita >= esquerda){
            meio = (esquerda + direita) / 2;

            if(num == array[meio]){
                resp = true;
                esquerda = array.length;
            } else if (num > array[meio]) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return resp;
    }
}
