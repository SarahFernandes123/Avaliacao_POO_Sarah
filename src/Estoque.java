import java.util.ArrayList;


public class Estoque {
     private ArrayList<Peca> pecas;

     public Estoque (){
        pecas = new ArrayList<>();
     }

     public void adicionarPeca(Peca peca) {
        pecas.add(peca);

}

        public double calcularQuantidadeEstoque() {
            double total = 0;
            for (Peca item : pecas) {
                total += item.getQuantidade();
            }
            return total;
        }
        
        public void exibirPecas(){
            for (Peca item:pecas){
                item.exibirInformacoes();
            }
        }


}
