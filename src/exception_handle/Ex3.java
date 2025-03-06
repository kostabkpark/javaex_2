package exception_handle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        // 숫자(정수)를 담을 수 있는 ArrayList 선언
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        //al.add("10"); 타입안정성
        int result = al.get(0) + 10; // 타입체크 및 형변환이 필요없이 사용가능
        // 문자열을 담을 수 있는 ArrayList 선언
        ArrayList<String> sl = new ArrayList<>();
        sl.add("A");
        //sl.add(1); 타입안정성
        System.out.println(sl.get(0).length());// 타입체크 및 형변환이 필요없이 사용가능

        //숫자(정수)를 담을 수 있는 Stack 선언
        Stack<Integer> sti = new Stack<>();
        sti.add(1);
        //sti.add("1");
        int number = sti.pop();
        //문자열을 담을 수 있는 Stack 선언
        Stack<String> ststr = new Stack<>();
        ststr.add("A");
        System.out.println(ststr.pop().toLowerCase());

        //숫자(정수)를 담을 수 있는 Queue 선언
        Queue<Integer> qi = new LinkedList<>();
        qi.add(1);
        int num2 = qi.poll();
        //문자열을 담을 수 있는 Queue 선언
        Queue<String> qs = new LinkedList<>();
    }
}
