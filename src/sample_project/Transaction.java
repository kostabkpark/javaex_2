package sample_project;

import java.time.LocalDateTime;

public class Transaction {
    BankCode bankCode;
    String accoutNo;
    TransactionCode trCode;
    LocalDateTime transactionDate;
    long transactionAmount;
    String clerkNo;
    TransactionStatus trStatus;

    public Transaction() {
        transactionDate = LocalDateTime.now();
    }
}
