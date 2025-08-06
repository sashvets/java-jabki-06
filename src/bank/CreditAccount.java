package bank;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        if (creditLimit < 0) {
            throw new IllegalArgumentException(
                    String.format("Кредитный лимит не может быть меньше нуля. Запрошено: %.2f", creditLimit));
        }
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -this.creditLimit) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException(
                    String.format("Запрошена сумма превышающая кредитный лимит, доступно: %.2f. Запрошено: %.2f", balance + this.creditLimit, amount));
        }

    }
}
