package exception_handle;

public class UncheckedDemo3 {
    public static void main(String[] args) {
        int[] array = {0,1,2} ;

        try {
            System.out.println(array[2]);
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("해당 값이 존재하지 않습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
