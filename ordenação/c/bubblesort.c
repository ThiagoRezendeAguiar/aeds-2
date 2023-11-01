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

void sort() {
  for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - 1; j++) {
      if (array[j] > array[j + 1]) {
        swap(j, j + 1);
      }
    }
  }
}

int main(void) {

  imprimir();
  sort();
  imprimir();

  return 0;
}