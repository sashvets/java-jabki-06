package bank;

public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException(
                    String.format("Некорректная сумма пополнения: %.2f", amount));
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException(
                    String.format("Некорректная сумма снятия: %.2f", amount));
        }
    }

    public void displayInfo() {
        System.out.printf("Номер счета: %s%nБаланс: %.2f%n", this.accountNumber, this.balance);
    }
}
