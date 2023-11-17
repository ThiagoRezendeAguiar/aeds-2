public class Main {
    public static void main(String[] args) {
        Arvore tree = new Arvore();

        try {
            tree.inserir(10);
            tree.inserir(9);
            tree.inserir(1);
            tree.inserir(11);
            tree.inserir(12);
            tree.caminhar();
            tree.remover(10);
            tree.caminhar();
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
