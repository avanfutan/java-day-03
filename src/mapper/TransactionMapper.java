package mapper;

import dto.TransactionSummary;
import model.Transaction;

public class TransactionMapper {
    public static TransactionSummary toTransactionSummary(Transaction transaction) {
        TransactionSummary transactionSummary = new TransactionSummary();
        transactionSummary.setAmount(transaction.getAmount());
        transactionSummary.setAccountNumber(transaction.getAccountNumber());
        return transactionSummary;
    }
}
