

// Superclasse que representa uma pessoa
public class pessoa {
    // Atributos comuns a todas as pessoas
    private String nome;
    private String cpf;
    private int idade;

    // Construtor
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}
// Subclasse que herda de Pessoa
public class Estudante extends Pessoa {
    // Atributos específicos de estudante
    private String matricula;
    private String curso;
    private double media;

    // Construtor - chama o construtor da superclasse usando 'super'
    public Estudante(String nome, String cpf, int idade, 
                     String matricula, String curso, double media) {
        super(nome, cpf, idade); // Inicializa atributos da superclasse
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }
}