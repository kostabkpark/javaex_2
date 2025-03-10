package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(30);
            list.add(number);
        }
        System.out.println(list);

        List<Integer> gt10 = new ArrayList<>();

        for (Integer i : list) {
            if(i > 10) {
                gt10.add(i);
            }
        }
        Collections.sort(gt10);
        System.out.println(gt10);

        // 연속된 데이터 + 함수형 처리연산

        list.stream()
                .filter(i -> i > 10) // Predicate 함수형 인터페이스의 익명구현체
                .sorted()
                .forEach(System.out::println); // Consumer 함수형 인터페이스의 익명구현체

    }
}
