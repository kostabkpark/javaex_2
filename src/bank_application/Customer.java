package bank_application;

import java.sql.Date;
import java.time.LocalDate;

public class Customer {
  private int custid;
  private String name;
  private Date opendate;
  private Date closedate;

  public Customer(String name) {
    this.custid = 0;
    this.name = name;
    this.opendate = Date.valueOf(LocalDate.now());
  }

  public int getCustid() {
    return custid;
  }

  public String getName() {
    return name;
  }

  public Date getOpendate() {
    return opendate;
  }

  public Date getClosedate() {
    return closedate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCustid(int custid) {
    // only after creating customer on database
    this.custid = custid;
  }

  public void leaveCustomer() {
    this.closedate = Date.valueOf(LocalDate.now());
  }

  @Override
  public String toString() {
    return "Customer{" +
        "custid=" + custid +
        ", name='" + name + '\'' +
        '}';
  }
}
