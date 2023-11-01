#include <stdio.h>

int array[] = {10, 5, 6, 1, 9, 4};
int n = sizeof(array) / sizeof(array[0]);

void imprimir() {
  for (int i = 0; i < n; i++) {
    printf("%d ", array[i]);
  }
  printf("\n");
}

void swap(int i, int j) {
  int aux = array[i];
  array[i] = array[j];
  array[j] = aux;
}

void sort(int esquerda, int direita) {
  int pivo = (esquerda + direita) / 2;
  int i = esquerda;
  int j = direita;

  while (i <= j) {
    while (array[i] < array[pivo]) {
      i++;
    }

    while (array[j] > array[pivo]) {
      j--;
    }

    if (i <= j) {
      swap(i, j);
      i++;
      j--;
    }
  }

  if (esquerda < j) {
    sort(esquerda, j);
  }
  if (direita > i) {
    sort(i, direita);
  }
}

int main(void) {

  imprimir();
  sort(0, n - 1);
  imprimir();

  return 0;
}