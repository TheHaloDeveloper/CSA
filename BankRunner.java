public class BankRunner {
    public static void main(String[] args) {
        Bank account = new Bank("John Doe", 123456, 1000.0);

        account.deposit(500.0);
        account.displayBalance();

        account.withdraw(300.0);
        account.displayBalance();

        account.withdraw(100.0);
        account.displayBalance();
    }
}