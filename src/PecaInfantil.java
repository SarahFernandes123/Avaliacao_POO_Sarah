public class PecaInfantil extends Peca implements  Desconto{
    public PecaInfantil(String codigo, double valor, double quantidade) { super(codigo, valor, quantidade);}
    
    @Override 
    public double CalcularPrecoFinal() {
        return getValor()*getQuantidade();
    }

    @Override
    public double calcularDesconto() {
        if (getValor()>250) {
            return getValor() *0.20;
        }
        if (getValor()>100) {
            return getValor()*0.10;
        }
        
        return 0;
    }
}
