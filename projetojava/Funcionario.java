package projetojava;
public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Funcionario(String nome, String sobrenome, String cpf) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("O sobrenome não pode ser vazio.");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("O CPF não pode ser vazio.");
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método abstrato que será implementado por cada subclasse
    public abstract double calcularVencimento();

    @Override
    public String toString() {
        return String.format("%s %s (CPF: %s)", getNome(), getSobrenome(), getCpf());
    }
}