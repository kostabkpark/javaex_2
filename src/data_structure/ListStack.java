package data_structure;

import java.util.EmptyStackException;

public class ListStack<E> {
    Node<E> top;
    int size;
    public ListStack(){
        top = null;
        size = 0;
    }
    boolean isEmpty() {
        return (size == 0) ? true : false;
    }
    int size() {
        return size;
    }
    // push, pop, peek 구현
    E peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.e;
    }
    // pop 과 push 를 구현하되 sLinkedList 의 코드를 활용해보라.

    void push(E e){
        // push 를 구현하되 sLinkedList 의 코드를 활용해보라.
        // 1단계

        // 2단계

        // 3단계

    }

    E pop() {
        // pop 을 구현하되 sLinkedList 의 코드를 활용해보라.

        return null;
    }

    private class Node<E> {
        E e;
        Node<E> next;
    }
}

