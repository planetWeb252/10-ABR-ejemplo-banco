public interface IAccount {
    String getAccountNumber();
    double getBalance();
    void deposit(double amount) throws IllegalArgumentException;
    void withdraw(double amount) throws IllegalArgumentException, InsufficientFundsException;
    void displayAccountInfo();
}
