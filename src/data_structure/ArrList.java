package data_structure;

import java.util.Arrays;

public class ArrList<E> {
    private E[] a; // E a[];
    private int size;

    public ArrList() {
        a = (E[])(new Object[1]);// 최초로 크기가 1인 배열 생성
        size = 0;
    }
    // 삽입, 탐색, 삭제 연산 메서드 구현
    public int size() {
        return size;
    }

    public int length() {
        return a.length;
    }

    public boolean add(E e){ // 맨 마지막에 추가한다.
        if(a.length == size) {
            // 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보기)
        }
        a[size] = e;
        size++;
        return true;
    }

    private void resize(int length) {
        // 배열의 크기를 length 만큼 증가 혹은 감소시킨다.
        // 기존배열의 값을 새로 만든 배열로 옮긴다.
        // 기존배열을 없애고 새로만든 배열을 a기 참조한다.
        E[] t = (E[]) new Object[length];
        //자바의 ArrayList 는 Arrays.copyOf , arraycopy 등과 같은 방법으로 최적화되어 있다.
        for (int i = 0; i < size; i++) {
            t[i] = a[i];
        }
        a = t;
    }

    public E remove() {
        if(size > 0) {

            E removed = a[size - 1];
            a[size - 1] = null;
            size--;

            if(a.length / 2 > size){
                // 배열의 크기를 반으로 줄인다.
                // 기존배열의 값을 새로 만든 배열로 옮긴다.
                // 기존배열을 없애고 새로만든 배열을 a기 참조한다.
                // 배열의 사이즈를 2배 증가시킨다. <==== (2. 여기 구현해보기)
            }
            return removed;
        } else {
            return null;
        }
    }

    public E peek(int k) {
        // underflow 방지하도록 코드 변경해야 하나
        // 이번 실습에서는 아주 간단히 구현해보기
        // <=== 여기 . (3. null 대신 해당하는 element 를 반환하도록 구현하기)
        return null;
    }

    @Override
    public String toString() {
        return "ArrList : " +
                Arrays.toString(a) ;
    }
}
