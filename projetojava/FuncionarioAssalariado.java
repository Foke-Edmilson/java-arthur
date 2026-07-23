package projetojava;
public class FuncionarioAssalariado extends Funcionario {
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
        super(nome, sobrenome, cpf);
        setSalarioSemanal(salarioSemanal);
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("O salário semanal deve ser >= 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double calcularVencimento() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Assalariado: %s | Salário Semanal: R$ %.2f", 
                super.toString(), getSalarioSemanal());
    }
}