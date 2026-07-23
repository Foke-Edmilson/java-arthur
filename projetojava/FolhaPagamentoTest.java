package projetojava;
import java.util.ArrayList;
import java.util.List;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE FOLHA DE PAGAMENTO - TESTE POO   ");
        System.out.println("=================================================\n");

        // Criando lista polimórfica com os casos de teste do documento
        List<Funcionario> funcionarios = new ArrayList<>();

        // Caso 1: Assalariado (R$ 1.200,00)
        funcionarios.add(new FuncionarioAssalariado("João", "Silva", "111.222.333-44", 1200.00));

        // Caso 2: Horista c/ hora extra (25.50 * 40 + 5 * 25.50 * 1.5 = R$ 1.211,25)
        funcionarios.add(new FuncionarioHorista("Maria", "Oliveira", "222.333.444-55", 25.50, 45.00));

        // Caso 3: Horista normal (30.00 * 38 = R$ 1.140,00)
        funcionarios.add(new FuncionarioHorista("Carlos", "Souza", "333.444.555-66", 30.00, 38.00));

        // Caso 4: Comissionado (10.000 * 0.06 = R$ 600,00)
        funcionarios.add(new FuncionarioComissionado("Ana", "Costa", "444.555.666-77", 10000.00, 0.06));

        // Caso 5: Assalariado Comissionado (800 + 15.000 * 0.05 = R$ 1.550,00)
        funcionarios.add(new FuncionarioAssalariadoComissionado("Pedro", "Santos", "555.666.777-88", 15000.00, 0.05, 800.00));

        double totalFolha = 0.0;

        // Processamento Polimórfico
        System.out.println("--- DEMONSTRATIVO DE PAGAMENTOS INDIVIDUAIS ---\n");
        int contador = 1;
        for (Funcionario f : funcionarios) {
            double vencimento = f.calcularVencimento();
            totalFolha += vencimento;

            System.out.printf("Caso [%d]: %s%n", contador++, f.toString());
            System.out.printf("   -> Vencimento Calculado: R$ %.2f%n", vencimento);

            // Exemplo de verificação com 'instanceof' e Bônus de 10% no Salário Base
            if (f instanceof FuncionarioAssalariadoComissionado) {
                FuncionarioAssalariadoComissionado fac = (FuncionarioAssalariadoComissionado) f;
                fac.setSalarioBase(fac.getSalarioBase() * 1.10);
                System.out.printf("   [BÔNUS RH] Novo Salário Base com +10%%: R$ %.2f | Novo Vencimento: R$ %.2f%n", 
                        fac.getSalarioBase(), fac.calcularVencimento());
            }
            System.out.println("------------------------------------------------------------------");
        }

        System.out.printf("%n>>> CUSTO TOTAL DA FOLHA DE PAGAMENTO: R$ %.2f <<<%n", totalFolha);
    }
}