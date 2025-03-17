package sample_project;

import java.time.LocalDateTime;

public class Transaction {
    BankCode bankCode;
    Account account;
    //String accoutNo;
    TransactionCode trCode;
    LocalDateTime transactionDate;
    long transactionAmount;
    BankClerk clerk;
    //String clerkNo;
    TransactionStatus trStatus;

    public Transaction(BankCode bankCode,
                       Account account,
                       TransactionCode trCode,
                       long transactionAmount,
                       BankClerk clerk) {
        this.bankCode = bankCode;
        this.account = account;
        this.trCode = trCode;
        transactionDate = LocalDateTime.now();
        this.transactionAmount = transactionAmount;
        this.clerk = clerk;
    }

    @Override
    public String toString() {
        String trDate = transactionDate.getYear() + "-" + transactionDate.getMonth() + "-" + transactionDate.getDayOfMonth();
        return "Transaction[" +
                "업무구분=" + trCode +
                ", 업무처리일자=" + trDate +
                ", 처리금액=" + transactionAmount +
                ", 처리상태=" + trStatus +
                ']';
    }
}
