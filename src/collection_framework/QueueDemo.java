package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        if(!q.isEmpty()) {
            q.remove();
        } else {
            System.out.println("큐가 비어있습니다.");
        }

        System.out.println(q.poll());

        q.add("1");
        q.add("2");
        q.add("3");

        while(!q.isEmpty()) {
           System.out.println(q.poll());
            //System.out.println(q.remove()); 앞에서 지움
        }

        q.clear();

        q.offer("10");
        q.offer("20");
        q.offer("30");

        System.out.println(q.peek());
        System.out.println(q.contains("10"));



    }
}
