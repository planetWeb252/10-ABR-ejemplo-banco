public class SavingsAccount extends AbstractBankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) throws IllegalArgumentException, InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor a 0");
        }

        if (getBalance() < amount) {
            throw new InsufficientFundsException("Saldo insuficiente para retirar" + amount + "€");
        }

        this.balance -= amount;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Tipo de cuenta: Ahorros");
    }
}
