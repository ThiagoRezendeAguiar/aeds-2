package ordenação.java;

public class Main {
    public static void main(String[] args){
        Array array = new Countingsort(10);
        array.imprimir();
        array.sort();
        array.imprimir();
    }

    
}
