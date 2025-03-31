package sample_project;

import java.util.*;

public class ShinhanBankApplication {
    public static void main(String[] args) {
        Map<String, BankClerk> clerkMap = new HashMap<>();
        BankClerk bankClerk = new BankClerk(BankCode.신한, "240101", "이신한");
        clerkMap.put("240101", bankClerk);
        Map<String, Account> accountMap = new HashMap<>();
        Map<Account, List<Transaction>> transactionMap = new HashMap<>();
        Map<String, Client> clientMap = new HashMap<>();
        Client client = null;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String randomAccNo = "";
        String clientNo = "";
        String clientName = "";
        String passwd1 = "";
        String passwd2 = "";
        long balance = 0L;
        Account account = null;
        Transaction transaction = null;

        String biz1 = """
                -----------------------------------------------------
                1: 계좌개설, 2:입금, 3:출금, 4:조회, 5: 계좌해지, 0: 종료 
                -----------------------------------------------------
                """;
        System.out.print(biz1);
        System.out.print("업무 구분 코드 > ");
        String menu = in.nextLine();
        if (menu.equals("1")) { // 입력 --> 계좌개설
            //==> 프로그램이 길어지면 메서드로 리팩토링 하면 됨.
            System.out.print("주민번호 앞 6자리를 입력하세요 > ");         // 입력 --> 고객 정보
            clientNo = in.nextLine();
            if (clientNo != null &&
                    clientNo.length() == 6 &&
                    clientNo.chars().allMatch(Character::isDigit)) {
                client = clientMap.get(clientNo);
                if (client == null) { // 신규 고객
                    System.out.print("고객명을 입력하세요 > ");
                    clientName = in.nextLine();
                    client = new Client(BankCode.신한, clientNo, clientName);
                    clientMap.put(clientNo, client);
                    // 고객 정보 생성 후 map 에 추가
                } else { // 기존 고객
                }
            }
            // 처리 --> 계좌 개설 / Client, Account
            while (true) {
                randomAccNo = String.valueOf(random.nextInt(99999) + 1);
                // 계좌번호는 랜덤하게 생성
                if (accountMap.get(random) == null) {
                    // 랜덤하게 생성한 코드가 기존에 없는 코드라면 해당코드를 이용해 계좌생성하고 while문 종료
                    break;
                } else {
                    // 기존에 존재하는 코드이면 다시 랜덤하게 생성하기
                    continue;
                }
            }

            while(true) {
                System.out.print("계좌개설시 입금하실 금액을 입력하세요 > ");
                balance = Long.parseLong(in.nextLine());
                System.out.print("입금하려는 금액이 " + balance + "가 맞습니까 ? (Y/N) > ");
                if(in.nextLine().equalsIgnoreCase("y")) {
                    break;
                } else {
                    continue;
                }
            }

            account = new Account(BankCode.신한, randomAccNo, client, balance);
            accountMap.put(randomAccNo, account);
            while (true) { // 비밀번호 입력을 정상적으로 했을 때 빠져나오게 하기, 오류 있으면 다시 입력받기
                System.out.print("사용하실 비밀번호를 숫자 4자리로 입력해주세요 > ");
                passwd1 = in.nextLine();// 입력 --> 비밀 번호
                System.out.print("비밀번호 확인 (숫자 4자리) > ");
                passwd2 = in.nextLine();
                if (passwd1 != null && passwd2 != null &&
                        passwd1.length() == 4 && passwd2.length() == 4 &&
                        passwd1.chars().allMatch(Character::isDigit) && passwd2.chars().allMatch(Character::isDigit) &&
                        passwd1.equals(passwd2)) {
                    account.passwd  = passwd1;
                    break;
                } else {
                    System.out.println("입력된 암호가 바르지 않습니다. 다시 입력해주세요.");
                    continue;
                }
            }
            // 처리 --> 계좌 개설 완료 / Transaction , Account
            transaction = new Transaction(BankCode.신한, account, TransactionCode.개설, balance, bankClerk);
            transaction.trStatus = TransactionStatus.정상;
            List<Transaction> trList = new LinkedList<>();
            trList.add(transaction);
            transactionMap.put(account, trList);
            System.out.println("계좌개설이 완료되었습니다.");
            System.out.println(client);
            System.out.println(account);
            System.out.println(bankClerk);
            System.out.println(trList.get(0));
        } else if (menu.equals("0")) {
            System.out.println("은행 업무를 종료합니다.");
            return;
        } // end of menu select
    } // end of method (main)
} // end of class
