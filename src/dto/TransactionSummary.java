package dto;

public class TransactionSummary {
    private String accountNumber;
    private double amount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionSummary{" + "accountNumber=" + accountNumber + ", amount=" + amount + '}';
    }
}

