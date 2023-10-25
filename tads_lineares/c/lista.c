#include <stdio.h>

#define MAXTAM 10

// Atributos
int array[MAXTAM];
int n;

// Construtor
void start() { n = 0; }

// Métodos de Inserção
void inserirInicio(int num) {
  if (n >= MAXTAM) {
    printf("Array Cheio");
  } else {

    for (int i = n; i > 0; i--) {
      array[i] = array[i - 1];
    }

    array[0] = num;
    n++;
  }
}

void inserirFim(int num) {
  if (n >= MAXTAM) {
    printf("Array Cheio");
  } else {

    array[n] = num;
    n++;
  }
}

void inserir(int num, int pos) {
  if (n >= MAXTAM) {
    printf("Array Cheio");
  } else if (pos < 0 || pos > n) {
    printf("Posição Inválida");
  } else {

    for (int i = n; i > pos; i--) {
      array[i] = array[i - 1];
    }

    array[pos] = num;
    n++;
  }
}

// Métodos de Remoção
void removerInicio() {
  if (n == 0) {
    printf("Array Vazio");
  } else {

    n--;
    for (int i = 0; i < n; i++) {
      array[i] = array[i + 1];
    }
  }
}

void removerFim() {
  if (n == 0) {
    printf("Array Vazio");
  } else {
    n--;
  }
}

void remover(int pos) {
  if (n == 0) {
    printf("Array Vazio");
  } else if (pos < 0 || pos >= n) {
    printf("Posição Inválida");
  } else {

    n--;
    for (int i = pos; i < n; i++) {
      array[i] = array[i + 1];
    }
  }
}

// Método de Exibição
void imprimir() {
  printf("[ ");
  for (int i = 0; i < n; i++) {
    printf("%d ", array[i]);
  }
  printf("]\n");
}

int main(void) {
  start();
  inserirInicio(1);
  inserirFim(5);
  inserirInicio(10);
  inserir(25, 2);
  imprimir();
  removerInicio();
  removerFim();
  remover(1);
  imprimir();
  return 0;
}