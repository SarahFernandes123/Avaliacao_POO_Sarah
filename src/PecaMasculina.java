public class PecaMasculina extends Peca implements Desconto {
    public PecaMasculina(String codigo, double valor, double quantidade) { super(codigo, valor, quantidade);}
    
    @Override
    public double calcularDesconto() {
        double total = getValor()*getQuantidade();
        
        if (total>150) {
            return 0.10;
        }
        return 0;
    }

    @Override 
    public double CalcularPrecoFinal() {
        double total = getValor()*getQuantidade();
        return total - (total*calcularDesconto());    
    }



}
