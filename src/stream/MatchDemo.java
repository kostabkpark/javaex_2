package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {
        boolean b1 = Stream.of("a1", "b1", "c2").anyMatch(x -> x.startsWith("c"));
        System.out.println(b1);

        System.out.println(Stream.of(2,4,6,8,10).allMatch(i -> i%2 == 0));

        System.out.println(Stream.of(2,4,6,8,10).noneMatch(i -> i%2 == 1));

        Stream<Nation> nations = Nation.nations.stream();
        if(nations.allMatch(nation -> nation.getPopulation() > 100)) { // 모든 국가의 인구가 전부 1억이 넘습니까?
            System.out.println("모든 국가의 인구가 1억이 넘는다.");
        } else {
            System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
        }

        Optional<Nation> first = Nation.nations.stream()
                .filter(nation -> nation.getGdpRank() == 10).findFirst();
        first.ifPresentOrElse(nation -> System.out.println("첫번째 국가는 " + nation.getName()),
                                () -> System.out.println("해당하는 국가를 찾을 수 없습니다."));


        Optional<Nation> any = Nation.nations.stream()
                .filter(nation -> nation.getGdpRank() < 1).findAny();
        any.ifPresentOrElse(x-> System.out.println("조건을 만족하는 국가는 " + x.getName()),
                            ()-> System.out.println("조건을 만족하는 국가를 찾을 수 없습니다."));
    }
}
