public abstract class Peca {
    private String codigo;
    private double valor;
    private double quantidade;

    public Peca(String codigo, double valor, double quantidade) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O codigo não pode ser vazio.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        if (quantidade <0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
       
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    
    public abstract double CalcularPrecoFinal();


    public void exibirInformacoes() {
        System.out.println("Codigo da peça: " + codigo);
        System.out.printf("Valor pago: R$ %.2f%n", CalcularPrecoFinal());
    }
}
