package data_structure;

public class ListQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;
    public ListQueue(){
        front = rear = null;
        size = 0;
    }
    boolean isEmpty() {
        return (size == 0) ? true : false;
    }
    int size() {
        return size;
    }

    // poll 과 offer 를 구현하되 sLinkedList 의 코드를 활용해보라.

    void offer(E e){
        // offer 를 구현하되 sLinkedList 의 코드를 활용해보라.
    }

    Node<E> getNode(int index){
        Node<E> find = front;
        System.out.println(find.e);
        for (int i = 0; i < index; i++) {
            System.out.println(find.e);
            find = find.next;
        }
        return find;
    }

    E poll() {
        // poll 을 구현하되 sLinkedList 의 코드를 활용해보라.
        return null;
    }

    private class Node<E> {
        E e;
        Node<E> next;
    }
}
