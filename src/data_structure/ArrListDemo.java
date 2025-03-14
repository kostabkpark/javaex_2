package data_structure;

import java.util.ArrayList;

public class ArrListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        //numbers.get(0); // IndexOutOfBoundsException
        //numbers.remove(0); // IndexOutOfBoundsException
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("add(값)");
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.add(1,50);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println("get(인덱스 2)");
        System.out.println(numbers.get(2));

        ArrList<Integer> arr = new ArrList<>();
        //arr.peek(0);
        arr.add(10);
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        arr.add(20);
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        arr.add(30);
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        arr.add(40);
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        arr.add(50);
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        System.out.println(arr);
        System.out.println("========삭제=======");
        arr.remove();
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        System.out.println(arr);
        arr.remove();
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        System.out.println(arr);
        arr.remove();
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        System.out.println(arr);
        arr.remove();
        System.out.println("list의 크기 : " + arr.size() + "," +
                "내부 배열의 크기 : " + arr.length());
        System.out.println(arr);
    }
}
