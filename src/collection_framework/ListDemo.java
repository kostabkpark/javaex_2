package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList(animals); // 반만 불변 객체
        //list.add("e"); // asList 를 사용하면 원소를 추가/삭제 X
        list.set(0,"A");
        //list.remove("c");
        System.out.println(list);

        List<Integer> list2 = List.of(1,2,3,4,5); // Factory Method , 완전 불변 객체
        //list2.add(6);
        //list2.set(0,10);
        System.out.println(list2);
        System.out.println(list2.get(1));

        Collection<Integer> listc = new ArrayList<>();
        listc.add(10);
        listc.add(20);
        System.out.println(listc);
        System.out.println(listc.remove(15));
        List<Integer> listl = new ArrayList<>();
        listl.add(10); // [10]
        listl.add(0,20); // [20, 10]
        System.out.println(listl);
        System.out.println(listl.remove(1) + "이 삭제되었습니다."); // [20]
        System.out.println(listl);


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(0,20);
        lista.set(1,100);

        System.out.println(lista);
    }
}
