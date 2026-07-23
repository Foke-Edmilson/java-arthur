package projetojava;
public class FuncionarioComissionado extends Funcionario {
    private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String sobrenome, String cpf, double vendasBrutas, double taxaComissao) {
        super(nome, sobrenome, cpf);
        setVendasBrutas(vendasBrutas);
        setTaxaComissao(taxaComissao);
    }

    public void setVendasBrutas(double vendasBrutas) {
        if (vendasBrutas < 0.0) {
            throw new IllegalArgumentException("As vendas brutas devem ser >= 0.0");
        }
        this.vendasBrutas = vendasBrutas;
    }

    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao <= 0.0 || taxaComissao >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve ser > 0.0 e < 1.0");
        }
        this.taxaComissao = taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    @Override
    public double calcularVencimento() {
        return getTaxaComissao() * getVendasBrutas();
    }

    @Override
    public String toString() {
        return String.format("Comissionado: %s | Vendas: R$ %.2f | Taxa: %.2f", 
                super.toString(), getVendasBrutas(), getTaxaComissao());
    }
}