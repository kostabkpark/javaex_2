package data_structure;

public class SLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SLinkedList() {
        head = tail = null;
        size = 0;
    }
    // 탐색, 삽입, 삭제 , size 를 구하는 메서드 구현
    int size() {
        return size;
    }

    void addLast(E e){
        Node<E> newNode = new Node<>();
        newNode.e = e;
        newNode.next = tail;
        if(size == 0) { // head == tail && head == null
            head = newNode;
        } else {
            getNode(size - 1).next = newNode;
        }
        tail = newNode;
        size++;
    }

    void addFirst(E e){
        // 1단계 : 새로운 노드를 생성한 후 node의 값을 설정한다음
        // 새로 생성된 노드가 맨 앞으로 가도록 한다.
        // < === 1) 여기를 구현한다.
        // 2단계 : 현재 데이터가 없는 경우, 즉 빈 리스트인 경우
        // head 와 tail 모두 newNode 가 되도록 처리한다.
        // 리스트에 데이터가 있을 경우에는 head 만 새로 추가된 노드로 변경해준다.
        // < === 2) 여기를 구현한다.
        // 3단계
        // 데이터가 하나 추가되었기 때문에 리스트의 사이즈를 하나 증가시킨다.
        // < === 3) 여기를 구현한다.
    }

    E getValue(int index){
        Node<E> find = head;
        for (int i = 0; i < index; i++) {
            find = find.next;
        }
        return find.e;
    }

    Node<E> getNode(int index){
        Node<E> find = head;
        System.out.println(find.e);
        for (int i = 0; i < index; i++) {
            System.out.println(find.e);
            find = find.next;
        }
        return find;
    }

    E removeLast() {
        // 1단계 : 맨 마지막 노드를 지우기 전 백업받아놓는다. removedNode
        // <=== 1) 여기를 구현한다.
        // 2-1단계 : 데이터가 2개 이상인 경우 (즉, 마지막 노드를 지워도 리스트가 비어있지 않은 경우)
        // 지우려는 노드의 바로 이전 노드를 찾아온다.
        // 마지막 노드를 삭제처리한다.
        // <=== 2) 여기를 구현한다.
        // 2-2단계 : 데이터가 1개만 있는 경우 (즉, 삭제하면 빈 리스트가 되는 경우)
        // head 와 tail 모두 null 로 만들어준다.
        // <=== 3) 여기를 구현한다.
        // 3단계 :  노드가 하나 삭제되었기 때문에 사이즈를 하나 줄여준다.
        // <=== 4) 여기를 구현한다.
        // 4단계 : 삭제된 노드(백업받아놓음)를 반환한다.
        // <=== 5) 여기를 수정하여 완성한다.
        return null;
    }

    E removeFirst() {
        Node<E> removedNode = head;
        head = head.next;
        removedNode.next = null;
        if (size == 1) {
            head = tail = null;
        }
        size--;
        return removedNode.e;
    }

    private class Node<E> {
        E e;
        Node<E> next;
    }
}
