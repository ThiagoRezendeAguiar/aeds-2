#include <stdio.h>

#define MAXTAM 10

int sequencial(int array[], int num){
    int resp = 0;

    for(int i = 0; i < MAXTAM; i++ ){
        if(array[i] == num) {
            resp = 1;
            break;
        }
    }

    return resp;
}

int binaria(int array[], int num){
    int direita = MAXTAM - 1;
    int esquerda = 0;
    int meio;
    int resp = 0;

    while(direita >= esquerda){
        meio = (esquerda + direita) / 2;
        if(num == array[meio]){
            resp = 1;
            esquerda = MAXTAM;
        } else if (num > array[meio]){
            esquerda = meio + 1;
        } else {
            direita = meio - 1;
        }
    }

    return resp;
}

int main (){
    int array[MAXTAM] = {1,2,3,4,5,6,7,8,9,10};

    printf("%d\n", sequencial(array, 11));
    printf("%d\n", binaria(array, 10));
    return 0;
}