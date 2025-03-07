package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isEmpty = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 0;
            }
        };

        String s = "";

        if(s != null && isEmpty.test(s)) {
            System.out.println("빈 문자열입니다.");
        }

        // Predicate interface 를 사용할 수 있는 곳에 람다식을 구현해 넣어야 한다.
        List<String> list = new ArrayList();
        list.add("abc");
        list.add("");
        list.add("def");
        list.removeIf(x->x.length() ==0) ;



    }
}
