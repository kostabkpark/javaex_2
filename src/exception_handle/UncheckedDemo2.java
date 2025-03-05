package exception_handle;

public class UncheckedDemo2 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나누면 안됩니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }
    }

    static void method1()
            throws ArithmeticException , IndexOutOfBoundsException,
            NullPointerException , IllegalArgumentException {
        method2();
    }

    static void method2()
            throws ArithmeticException , IndexOutOfBoundsException,
                    NullPointerException , IllegalArgumentException{
        int i = 1/1;
        System.out.println(i);
        throw new NullPointerException();
    }
}
