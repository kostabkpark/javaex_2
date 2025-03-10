package collection_framework;

import java.util.*;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<String> list1 = List.of("포도", "키위", "수박", "사과", "망고", "포도", "키위", "수박", "사과", "망고");
        System.out.println(list1);
        Set<String> set = new HashSet<>(list1);
        System.out.println(set);
        //list1.set(0,"키위");// 수정 불가 -> immutable
        List<String> list2 = new ArrayList<>(set);
        System.out.println(list2);
        list2.set(0,"키위");
        System.out.println(list2);

        for (String s : list2) {
            System.out.println(s + "가 " + Collections.frequency(list2, s) + "번 존재합니다.");

        }

    }
}
