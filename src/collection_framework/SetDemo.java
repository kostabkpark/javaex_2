package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        System.out.println(set);

        set.add(10);
        System.out.println(set);

        set.add(20);
        set.add(5);
        System.out.println(set);

        Set<String> s = Set.of("a", "b", "c", "d");
        HashSet<String> set2 = new HashSet<>(s);
        set2.add("e");
        set2.add("a");
        System.out.println(set2);

    }
}
