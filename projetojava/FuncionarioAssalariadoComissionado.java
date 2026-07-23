package projetojava;
public class FuncionarioAssalariadoComissionado extends FuncionarioComissionado {
    private double salarioBase;

    public FuncionarioAssalariadoComissionado(String nome, String sobrenome, String cpf, 
                                              double vendasBrutas, double taxaComissao, double salarioBase) {
        super(nome, sobrenome, cpf, vendasBrutas, taxaComissao);
        setSalarioBase(salarioBase);
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("O salário base deve ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularVencimento() {
        // Reutiliza o cálculo de comissão da superclasse + o salário base
        return getSalarioBase() + super.calcularVencimento();
    }

    @Override
    public String toString() {
        return String.format("Assalariado Comissionado: %s | Salário Base: R$ %.2f", 
                super.toString(), getSalarioBase());
    }
}