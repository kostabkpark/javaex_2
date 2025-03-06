package exception_handle;

public class UncheckedDemo {
    public static void main(String[] args) {
        // try ~ catch ~ 문 으로 예외처리를 하면, 핵심로직과 비핵심로직이 분리되어 가독성이 좋아지고 유지보수가 쉬워진다.
        int number = 0;
        int result = 0;
        try {
            result = 1 / number;
            result = 2 / number;
            result = 3 / number;
        } catch (ArithmeticException e){
            e.printStackTrace(); // 개발할때
            System.out.println(e.getMessage()); // 사용자가 보기 편한 메시지로 변환하는 것을 권장.
        }
// if ~ else ~ 문 만으로도 예외처리를 할 수 있으나, 핵심로직과 비핵심로직이 섞여있어서 가독성이 떨어지고 유지보수가 어렵다.
//        int number = 0;
//        if(number == 0) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        } else {
//            int result = 1 / number;
//        }
//
//        if(number == 0) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        } else {
//            int result = 2 / number;
//        }
//
//        if(number == 0) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        } else {
//            int result = 3 / number;
//        }

    }
}
