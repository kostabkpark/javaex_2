package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamObjectDemo {
    public static void main(String[] args) {
        List<Nation> nations = Nation.nations;
        Stream<Nation> stream = nations.stream();
        stream.filter(nation -> nation.getPopulation() >= 100) // 인구가 1억 (100 백만) 보다 큰 나라만 걸러내기
                .limit(2)
                .forEach(nation ->
                        System.out.println("인구가 1억 이상인 나라는 "+ nation.getName() + " 이고," +
                                 nation.getPopulation() +" 입니다.")); // 인구가 1억 이상인 나라는 "이름"  입니다.

    }
}
