package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //System.out.println(list);

        //list.forEach(i-> System.out.print(i + ":")); // list의 모든 요소를 출력하는 람다식
        list.removeIf(j -> j % 2 == 0); // list 의 모든 요소를 읽어서 짝수를 삭제한다.
        list.forEach(i-> System.out.print(i + ":"));
        list.replaceAll(i->i*10);// list의 모든 요소에 10을 곱한다.
        list.forEach(i-> System.out.print(i + ":"));
        System.out.println();
        list.forEach(System.out::println);

        System.out.println();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"사과");
        map.put(2,"딸기");
        map.forEach((key,value) -> System.out.println(key + "," + value));

        Function<String,Integer> f = (s) -> Integer.parseInt(s);
        f = Integer::parseInt;  // Static Method 참조
        //      인스턴스 메서드 찹조
        BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.equals(s2);
        f1 = String::equals;

        // 특정 객체의 인스턴스 메서드 참조
        MyClass mc = new MyClass();
        Function<String, Boolean> f2 = (x) -> mc.equals(x);
        f2 = mc::equals;

        // new 연산자(생성자) 참조
        Supplier<MyClass> s = MyClass::new;
        Function<Integer, MyClass> f3 = MyClass::new;

    }
}

class MyClass {
    int i;
    public MyClass() {}
    public MyClass(int i) {
        this.i = i;
    }
}