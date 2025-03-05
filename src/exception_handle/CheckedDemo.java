package exception_handle;

import java.io.IOException;

public class CheckedDemo {
    public static void main(String[] args) {
        try {
            try {
                method1();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("method1 실행에서 사용한 클래스를 찾을 수 없습니다.");
        }
    }

    static void method1() throws ClassNotFoundException, IOException, InterruptedException  {
        method2();
    }

    static void method2() throws ClassNotFoundException, IOException, InterruptedException {

        Class clazz = Class.forName("java.lang.String2");
    }

}
