public abstract class AbstractBankAccount implements IAccount {
    private String accountNumber;
    protected double balance;

    public AbstractBankAccount(String accountNumber, double initialBalance) throws IllegalArgumentException {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("El número de cuenta no puede estar vacío");
        }

        if (initialBalance <= 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo o 0");
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser superior a 0");
        }
        this.balance += amount;
        System.out.println("Se han depositado " + amount + "€ \nEn la cuenta " + accountNumber + ". \nTu saldo actual es de: " + balance);
    }

    @Override
    public abstract void withdraw(double amount) throws IllegalArgumentException, InsufficientFundsException;

    @Override
    public void displayAccountInfo() {
        System.out.println("Número de cuenta: " + accountNumber);
        System.out.println("Saldo disponible: " + balance + "€");
    }
}
