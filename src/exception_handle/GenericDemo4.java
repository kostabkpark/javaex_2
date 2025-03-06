package exception_handle;

import java.util.ArrayList;

public class GenericDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        //list.add('c');  // 타입 안정성 보장
        //list.add("abc");
        // 하위호환성을 위해 존재하는 Object 을 원소로 하는 ArrayList를 사용하면
        // ClassCastException 이 발생할 수 있다.
        int i = (Integer)list.get(2);  // "abc" , (Integer)10.0 ==> 10
    }
}
