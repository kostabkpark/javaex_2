package lambda;

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        // action - 두 개의 정수를 입력 받아서 두 수를 더한 후 그 결과를 출력한다. : 익명클래스
        Calculable cal = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int res = x + y;
                System.out.println(res);
            }
        };

        Calculable cal2 = (x, y) -> {
            int res = x + y;
            System.out.println(res);
        };

        cal2.calculate(3,5);

    }
}

@FunctionalInterface
interface Calculable {
    // 추상메서드
    void calculate(int x, int y);
}

class Add implements Calculable {
    @Override
    public void calculate(int x, int y) {
        int res = x + y;
        System.out.println(res);
    }
}