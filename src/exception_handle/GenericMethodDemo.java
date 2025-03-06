package exception_handle;

public class GenericMethodDemo {
    static class Utils {
        // 제너릭 메서드  - <T> 반환타입 메서드명() { }
        // 제너릭 타입 범위 제한 - <T extends 클래스명>
        public static <T extends Number> void showArray(T[] a){
            for(T t : a) {
                System.out.println(t);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        Double[] b = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] c = {'a', 'b', 'c', 'd', 'e'};
        Boolean[] d = {true,false};

        Utils.showArray(a);
        Utils.showArray(b);
//        Utils.showArray(c);
//        Utils.showArray(d);
    }
}
