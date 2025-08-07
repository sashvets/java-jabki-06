package bank;

public class SavingsAccount extends Account {
    private double interestRate;
    private static final double MAX_WITHDRAW = 1000;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException(
                    String.format("Процентная ставка счета: %.2f не может быть меньше нуля", interestRate));
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.MAX_WITHDRAW) {
            throw new IllegalArgumentException(
                    String.format("Лимит операции на разовое снятие: %.2f Запрошено: %.2f", this.MAX_WITHDRAW, amount));
        }
        super.withdraw(amount);
    }

    public void applyInterest() {
        balance += balance * this.interestRate / 100;
    }
}