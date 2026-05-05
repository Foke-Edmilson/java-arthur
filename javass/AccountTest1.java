package javass;
import java.util.Scanner;
// Classe principal
public class AccountTest1 {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        account1.deposit(depositAmount);

        System.out.printf("%n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();

        account2.deposit(depositAmount);

        System.out.printf("%n%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

        input.close();
    }
}
// Classe Account (CORRIGIDA)
class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}