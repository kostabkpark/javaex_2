package data_structure;

import java.util.LinkedList;

public class SLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(10);
        ll.addFirst(20);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        SLinkedList<Integer> sl = new SLinkedList<>();
        sl.addFirst(10);
        System.out.println(sl);

        sl.addFirst(20);
        System.out.println(sl);
        sl.addLast(30);
        System.out.println(sl);
        //sl.removeFirst();
        sl.removeLast();
        System.out.println(sl);
    }
}
