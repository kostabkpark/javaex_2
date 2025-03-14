package data_structure;

import java.util.Stack;

public class ListStackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        ListStack<String> lstack = new ListStack<>();
        lstack.push("A");
        lstack.push("B");
        lstack.push("C");

        System.out.println(lstack.pop());
        System.out.println(lstack.pop());
        System.out.println(lstack.pop());
    }
}
