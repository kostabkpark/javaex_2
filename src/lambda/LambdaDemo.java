package lambda;

public class LambdaDemo {
    public static void main(String[] args) {
//        Object obj = new Object() {
//            int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };
//        System.out.println(obj.max(3,5)); //==> 5

        MyFunction m = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return 0;
            }
        }; // 익명클래스 만드는 문법 7장 34 페이지

        MyFunction m2 = (a, b) -> a > b ? a : b;

        System.out.println(m.max(3,5)); // ==> 5
        System.out.println(m2.max(10,5)); // ==> 10
    }
}

@FunctionalInterface
// 함수형 인터페이스 - 단 하나의 추상 메서드만 가지는 인터페이스
interface MyFunction {
  public abstract int max(int a, int b);
}

//class A implements MyFunction {
//    @Override
//    public int max(int a, int b) {
//        return 0;
//    }
//}

//(a,b) -> a > b ? a : b;
//class AnyObject {
//    class Anonymous {
//        int max(int a, int b) {
//            return a > b ? a : b;
//        }
//    }
//}

