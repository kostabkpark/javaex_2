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
        return top.item;
    }
    // pop 과 push 를 구현하되 sLinkedList 의 코드를 활용해보라.

    void push(E item){
        // push 를 구현하되 sLinkedList 의 코드를 활용해보라.
        // 1단계
        Node<E> newNode = new Node<>(item, top);
        // 2단계
        top = newNode;
        // 3단계
        size++;
    }

    E pop() {
        // pop 을 구현하되 sLinkedList 의 코드를 활용해보라.
        Node<E> removedNode = top;
        top = top.next;
        removedNode.next = null;
        if (size == 1) {
            top = null;
        }
        size--;
        return removedNode.item;
    }

    private class Node<E> {
        E item;
        Node<E> next;

        public Node(E newItem, Node<E> node) {
            this.item = newItem;
            next = node;
        }
    }
}

