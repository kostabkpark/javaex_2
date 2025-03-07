package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long start = System.nanoTime();
        long startMillis = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            al.add(0,i);
        }
        long end = System.nanoTime();
        long endMillis = System.currentTimeMillis();
        System.out.println("배열에 맨앞에 원소를 추가하는데 걸리는 시간 : " + (end - start));
        System.out.println("배열에 맨앞에 원소를 추가하는데 걸리는 시간 : " + (endMillis - startMillis));

        start = System.nanoTime();
        startMillis = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ll.addFirst(i);
        }
        end = System.nanoTime();
        endMillis = System.currentTimeMillis();
        System.out.println("연결리스트의 맨앞에 원소를 추가하는데 걸리는 시간 : " + (end - start));
        System.out.println("연결리스트의 맨앞에 원소를 추가하는데 걸리는 시간 : " + (endMillis - startMillis));
    }
}
