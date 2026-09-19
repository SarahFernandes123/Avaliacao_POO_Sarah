public class Loja {
    private Estoque estoque;

    public Loja(){
        estoque = new Estoque();
    }

    public void adicionarPeca(Peca peca) {
        estoque.adicionarPeca(peca);
    }

    public void exibirPecas(){
        estoque.exibirPecas();
    }

    public double calcularQuantidadeEstoque(){
        return estoque.calcularQuantidadeEstoque();
    }

}
