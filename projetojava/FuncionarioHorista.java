package projetojava;
public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private double horas;

    public FuncionarioHorista(String nome, String sobrenome, String cpf, double valorHora, double horas) {
        super(nome, sobrenome, cpf);
        setValorHora(valorHora);
        setHoras(horas);
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0.0) {
            throw new IllegalArgumentException("O valor por hora deve ser >= 0.0");
        }
        this.valorHora = valorHora;
    }

    public void setHoras(double horas) {
        if (horas < 0.0 || horas > 168.0) {
            throw new IllegalArgumentException("As horas trabalhadas devem ser entre 0 e 168");
        }
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double calcularVencimento() {
        if (getHoras() <= 40) {
            return getValorHora() * getHoras();
        } else {
            return 40 * getValorHora() + (getHoras() - 40) * getValorHora() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Horista: %s | Valor/Hora: R$ %.2f | Horas: %.2f", 
                super.toString(), getValorHora(), getHoras());
    }
}