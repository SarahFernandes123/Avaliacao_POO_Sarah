public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();
        PecaFeminina feminina = new PecaFeminina("F001", 200, 2);
        PecaMasculina masculina = new PecaMasculina("M001", 120, 3);
        PecaInfantil infantil = new PecaInfantil("I001",80,5);

        loja.adicionarPeca(feminina);
        loja.adicionarPeca(infantil);
        loja.adicionarPeca(masculina);

        loja.exibirPecas();

        

        System.out.println("Quantidade total no estoque" + loja.calcularQuantidadeEstoque());
    }
}
 