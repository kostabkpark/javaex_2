package exercise.chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
        // 1) 스트림을 생성하라.
        Stream<String> stream = capitals.stream();
        // 2) 정렬하라.(오름차순)
        Stream<String> sorted = stream.sorted();
        // 3) 첫번째 수도를 출력하라.
        System.out.println(sorted.findFirst().get());
    }
}
