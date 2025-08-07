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
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    String.format("Сумма снятия %.2f должна быть больше нуля", amount));
        } else if (amount > this.balance) {
            throw new IllegalArgumentException(
                    String.format("Cумма снятия %.2f, не может превышать баланс %.2f", amount, this.balance));
        } else {
            this.balance -= amount;
        }
    }

    public void displayInfo() {
        System.out.printf("Номер счета: %s%nБаланс: %.2f%n", this.accountNumber, this.balance);
    }
}
