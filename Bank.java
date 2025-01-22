public class Bank {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public Bank(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Failed.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}