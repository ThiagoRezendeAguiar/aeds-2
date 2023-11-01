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
  for (int i = 0; i < n; i++) {
    int menor = i;
    for (int j = i + 1; j < n; j++) {
      if (array[j] < array[menor]) {
        menor = j;
      }
    }
    swap(i, menor);
  }
}

int main(void) {

  imprimir();
  sort();
  imprimir();

  return 0;
}