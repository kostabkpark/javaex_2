package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        List<String> list1 = List.of("a1", "c2", "d3", "b2", "a4");
        list1.stream().sorted()
                .forEach(Util::printWithParenthesis);

        System.out.println();
        List<Integer> list2 = List.of(7,10,5,3,1,2);
        list2.stream()
                .sorted()
                .forEach(Util::printWithParenthesis);
        System.out.println();
        // 나라이름 순으로 오름차순 정렬
        List<Nation> list3 = Nation.nations;
        Stream<Nation> sorted = list3.stream().sorted(Comparator.comparing(nation -> nation.getName()));
        sorted.forEach(nation -> Util.printWithParenthesis(nation.getName()));
        System.out.println();
        // GDP 순으로 오름차순
        list3.stream()
                .sorted(Comparator.comparing(nation -> nation.getGdpRank()))
                .forEach(nation -> Util.printWithParenthesis(nation.getName() + ":" + nation.getGdpRank()));
        System.out.println();
        // 인구수 순으로 오름차순 정렬
        list3.stream()
                .sorted(Comparator.comparing(nation -> nation.getPopulation()))
                .forEach(nation -> Util.printWithParenthesis(nation.getName() + ":" + nation.getPopulation()));
        System.out.println();
        // 인구수 순으로 내림차순 정렬
        List<Nation> list4 = Nation.nations;
        Stream<Nation> stream = list4.stream();
                stream.sorted(Comparator.comparing(Nation::getPopulation).reversed())
                .forEach(nation -> Util.printWithParenthesis(nation.getName() + ":" + nation.getPopulation()));
    }
}
