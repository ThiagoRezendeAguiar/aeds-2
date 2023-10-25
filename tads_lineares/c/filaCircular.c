#include <stdio.h>

#define MAXTAM 10

// Atributos
int array[MAXTAM];
int inicio, fim;

// Construtor
void start() { inicio = fim = 0; }

// Método de Inserção
void inserir(int num) {
  if ((fim + 1) % MAXTAM == inicio) {
    printf("Array Cheio");
  } else {
    array[fim] = num;
    fim = (fim + 1) % MAXTAM;
  }
}

// Método de Remoção
void remover() {
  if (fim == inicio) {
    printf("Array Vazio");
  } else {
    inicio = (inicio + 1) % MAXTAM;
  }
}

// Método de Exibição
void imprimir() {
  printf("[ ");
  for (int i = inicio; i < fim; i++) {
    printf("%d ", array[i]);
  }
  printf("]\n");
}

int main() {
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