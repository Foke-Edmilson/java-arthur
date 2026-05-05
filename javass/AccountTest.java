package javass;
import javax.swing.JOptionPane; 

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Edmilson", 50.00);
        Account account2 = new Account("John pobre",  -7.53);

        // Exibir saldos iniciais em uma janela
        String saldoInicial = String.format("%s na conta: $%.2f%n%s na conta: $%.2f",
                account1.getName(), account1.getBalance(),
                account2.getName(), account2.getBalance());
        
        JOptionPane.showMessageDialog(null, saldoInicial, "Saldos Iniciais", JOptionPane.INFORMATION_MESSAGE);

        // Entrada de dados para conta 1 via janela
        String input1 = JOptionPane.showInputDialog("adicinar um valor para conta1:");
        if (input1 != null) { // Verifica se o usuário não cancelou a janela
            double depositAmount = Double.parseDouble(input1);
            account1.deposit(depositAmount);
        }

        // Entrada de dados para conta 2 via janela
        String input2 = JOptionPane.showInputDialog("adicinar um valor para conta2:");
        if (input2 != null) {
            double depositAmount = Double.parseDouble(input2);
            account2.deposit(depositAmount);
        }

        // Exibir saldos finais em uma janela
        String saldoFinal = String.format("%s, saldo final: $%.2f%n%s, saldo final: $%.2f",
                account1.getName(), account1.getBalance(),
                account2.getName(), account2.getBalance());
        
        JOptionPane.showMessageDialog(null, saldoFinal, "Saldos Finais", JOptionPane.INFORMATION_MESSAGE);
    }
}