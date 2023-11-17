public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    // Inserir
    public void inserir(int num) throws Exception {
        raiz = inserir(num, raiz);
    }

    private No inserir(int num, No i) throws Exception {
        if (i == null) {
            i = new No(num);
        } else if (i.getElemento() > num) {
            i.setEsq(inserir(num, i.getEsq()));
        } else if (i.getElemento() < num) {
            i.setDir(inserir(num, i.getDir()));
        } else {
            throw new Exception("Esse número já foi inserido !");
        }
        return i;
    }

    // Caminhamento
    public void caminhar() {
        System.out.println("\nPré-Ordem :");
        pre(raiz);
        System.out.println("\nEm-Ordem :");
        central(raiz);
        System.out.println("\nPós-Ordem :");
        pos(raiz);
    }

    private void pre(No i) {
        if (i != null) {
            System.out.print(i.getElemento() + " ");
            pre(i.getEsq());
            pre(i.getDir());
        }
    }

    private void central(No i) {
        if (i != null) {
            central(i.getEsq());
            System.out.print(i.getElemento() + " ");
            central(i.getDir());
        }
    }

    private void pos(No i) {
        if (i != null) {
            pos(i.getEsq());
            pos(i.getDir());
            System.out.print(i.getElemento() + " ");
        }
    }

    // Remover
    public void remover(int num) throws Exception{
        raiz = remover(num, raiz);
    }

    private No remover (int num, No i) throws Exception{
        if(i == null){
            throw new Exception("Valor não encontrado");
        } else if (i.getElemento() > num){
            i.setEsq(remover(num, i.getEsq()));
        } else if (i.getElemento() < num){
            i.setDir(remover(num, i.getDir()));
        } else if (i.getEsq() == null){
            i = i.getDir();
        } else if (i.getDir() == null){
            i = i.getEsq();
        } else {
            i.setEsq(maiorEsq(i, i.getEsq())); 
        }

        return i;
    }

    private No maiorEsq(No i, No j){
        if(j.getDir() == null){
            i.setElemento(j.getElemento());
            j = j.getEsq();
        } else {
            j.setDir(maiorEsq(i, j.getDir()));
        }
        return j;
    } 
}
