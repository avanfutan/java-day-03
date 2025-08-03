import dto.TransactionSummary;
import mapper.TransactionMapper;
import model.Transaction;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Task02 {
    public static List<Transaction> loadTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            String type = i%2 == 0 ? "DEBIT" : "CREDIT";
            String accountNumber = String.valueOf((i % 5) + 1);
            Transaction transaction = new Transaction();
            transaction.setTransactionId(String.valueOf(i+1));
            transaction.setAccountNumber(accountNumber);
            transaction.setType(type);
            transaction.setAmount((i+1) * 500);
            transaction.setTimestamp(LocalDateTime.now());
            transactions.add(transaction);
        }

        return transactions;
    }


    public static void run() {
        List<Transaction> transactions = loadTransactions();

        // Filter all DEBIT transactions greater than $10000
        // Then map to Transaction Summary
        List<TransactionSummary> transactionSummaries = transactions
                .stream()
                .filter(transaction -> Objects.equals(transaction.getType(), "DEBIT") && transaction.getAmount() > 10000)
                .map(TransactionMapper::toTransactionSummary)
                .toList();
        transactionSummaries.forEach(System.out::println);

        // Group transaction by Account Number
        Map<String, Double> transactionsByAccountNumber = transactionSummaries
                .stream()
                .collect(Collectors.groupingBy(TransactionSummary::getAccountNumber, Collectors.summingDouble(TransactionSummary::getAmount)));
        transactionsByAccountNumber.entrySet().forEach(System.out::println);


        // Sort accounts by total DEBIT amount in descending order.
        // Collect the result into a LinkedHashMap to preserve sort order.
        Map<String, Double> sortedDebits = transactionsByAccountNumber.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // Print Result
        System.out.println("Account Number | Total Debit Amount");
        sortedDebits.forEach((account, total) -> {
            System.out.println(account + " | $" + total);
        });
    }


}
