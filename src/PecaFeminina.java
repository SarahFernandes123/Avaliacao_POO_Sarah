public class PecaFeminina extends Peca implements Desconto{
    public PecaFeminina(String codigo, double valor, double quantidade) { super(codigo, valor, quantidade);}
    
    @Override
    public double calcularDesconto() {
        double total = getValor()*getQuantidade();
        
        if (total>150) {
            return 0.20;
        }
        
        return 0;
    }

    @Override 
    public double CalcularPrecoFinal() {
       double total = getValor()*getQuantidade();
       return total - (total *calcularDesconto());
    }



}
