package model;

import java.time.LocalDateTime;

public class Transaction {
        private String transactionId;
        private String accountNumber;
        private double amount;
        private String type;
        private LocalDateTime timestamp;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }
}
