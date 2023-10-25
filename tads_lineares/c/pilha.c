#include <stdio.h>

#define MAXTAM 10

// Atributos
int array[MAXTAM];
int n;

// Construtor
void start(){ n = 0; }

// Método de Inserção
void inserir(int num){
    if(n >= MAXTAM){
        printf("Array Cheio");
    } else {
        array[n] = num;
        n++;
    }
}

// Método de Remoção
void remover(){
    if(n == 0) {
        printf("Array Vazio");
    } else {
        n--;
    }
}

// Método de Exibição
void imprimir(){
    printf("[ ");
    for(int i = 0; i < n; i++){
        printf("%d ", array[i]);
    }
    printf("]\n");
}

int main(){
    start();
    inserir(1);
    inserir(5);
    inserir(10);
    inserir(25);
    imprimir();
    remover();
    remover();
    remover();
    imprimir();
    return 0;
}