package sample_project;

import java.time.LocalDate;

public class Client {
    BankCode bankCode;
    String clientNo;
    String clientName;
    LocalDate openDate;
    LocalDate closeDate;

    public Client(BankCode bankCode,
                  String clientNo,
                  String clientName) {
        this.bankCode = bankCode;
        this.clientNo = clientNo;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "고객[" +
                "bankCode=" + bankCode +
                ", 고객명=" + clientName + "]";
    }
}
