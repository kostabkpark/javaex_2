package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        for(Integer i : list) {
            System.out.println(i);
        }

        list.clear();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println(list.remove()); // 맨 앞에 요소를 삭제
        System.out.println(list.removeFirst());
    }
}
