#include <stdio.h>

int array[] = {10, 5, 6, 1, 9, 4};
int n = sizeof(array) / sizeof(array[0]);

void imprimir() {
  for (int i = 0; i < n; i++) {
    printf("%d ", array[i]);
  }
  printf("\n");
}

void sort() {
  int aux;
  int j;
  for (int i = 1; i < n; i++) {
    aux = array[i];
    for (j = i - 1; (j >= 0) && (aux < array[j]); j--) {
      array[j + 1] = array[j];
    }
    array[j + 1] = aux;
  }
}

int main(void) {

  imprimir();
  sort();
  imprimir();

  return 0;
}