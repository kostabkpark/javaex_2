package sample_project;

public class BankClerk {
    BankCode bankCode;
    String clerkNo; // 6 digits numeric
    String clerkName;

    public BankClerk(BankCode bankCode, String clerkNo,
                     String clerkName) {
        this.bankCode = bankCode;
        this.clerkNo = clerkNo;
        this.clerkName = clerkName;
    }
}
