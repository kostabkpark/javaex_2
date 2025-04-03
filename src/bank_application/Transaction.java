package bank_application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
  private int code;
  private int seq;
  private Kubun kubun;
  private String transaction_date;
  private int amount;
  private Status status;

  public Transaction(int code, int seq, Kubun kubun, int amount) {
    this.code = code;
    this.seq = seq;
    this.kubun = kubun;
    this.amount = amount;
    this.transaction_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss"));
    this.status = Status.success;
  }
}
