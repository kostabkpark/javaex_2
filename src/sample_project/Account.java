package sample_project;

import java.time.LocalDate;

public class Account {
    BankCode bankCode;
    String accountNo ; // 5 digits numeric
    String clientNo ; // 6 digits numeric
    String passwd ; // 4 digits numeric
    LocalDate openDate ;
    LocalDate cancelDate ;
    boolean dormant ; // 휴면계좌 : true, default = false
    long balance ;

    public Account(BankCode bankCode, String accountNo,
                   String clientNo, long balance) {
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.clientNo = clientNo;
        this.openDate = LocalDate.now(); // 생성
        this.balance = balance;
    }

    public void deposit(long money) {

    }

    public void withdraw(long money) {

    }

    public long inquiry() {
        return balance;
    }

    public void cancel() {

    }
}
