package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupbyDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Map<Nation.Type, List<Nation>> collect = sn.collect(Collectors.groupingBy(Nation::getType));
        System.out.println(collect);

        sn = Nation.nations.stream();
        Map<Nation.Type, Long> collect1 = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
        System.out.println(collect1);
    }
}
