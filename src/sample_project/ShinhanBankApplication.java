package sample_project;

import java.util.HashMap;
import java.util.Map;

public class ShinhanBankApplication {
    public static void main(String[] args) {
        Map<String, Account> accountMap = new HashMap<>();


        System.out.println("업무 설명 화면 1 ");
        // 입력 --> 계좌개설
        System.out.println("고객 정보 입력 화면 2 ");
        // 입력 --> 고객 정보
        // 처리 --> 계좌 개설 / Client, Account
        System.out.println("고객 비밀 번호 입력 화면 3 ");
        // 입력 --> 비밀 번호
        // 처리 --> 계좌 개설 완료 / Transaction , Account
        Account a1 = new Account(BankCode.신한, "11111","900101", 10) ;
        System.out.println(a1.dormant);
        System.out.println(a1.openDate);

        accountMap.put("11111", a1);

        Transaction t1 = new Transaction();
        System.out.println(t1.transactionDate);

    }
}
