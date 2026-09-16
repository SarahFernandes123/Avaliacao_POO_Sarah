public class PecaMasculina extends Peca implements Desconto {
    public PecaMasculina(String codigo, double valor, double quantidade) { super(codigo, valor, quantidade);}
    
    @Override 
    public double CalcularPrecoFinal() {
        double total = getValor()*getQuantidade();
        return total - (total*calcularDesconto());    
    }

    @Override
    public double calcularDesconto() {
        if (getValor()>150) {
            return getValor() *0.10;
        }
        return 0;
    }

}
