package javass;
  class Account {
    private String name; // variável de variável
    private double balance; 

    // Construtor que recebe nome e saldo inicial
    public Account(String name, double balance) {
        this.name = name;

        // ele vai ver se o saldo inicial é maior que 0
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // Método para depositar apenas quantias válidas
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    //  retornar o saldo
    public double getBalance() {
        return balance;
    }

    // Métodos para configurar e obter o nome
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}