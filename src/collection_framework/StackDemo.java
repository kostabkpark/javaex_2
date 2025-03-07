package collection_framework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        if(!stack.isEmpty()) {
            System.out.println(stack.peek());
        } else {
            System.out.println("자료가 없습니다.");
        }
//        stack.add("A");
//        stack.add(1,"B");
        stack.push("10");
        stack.push("20");
        stack.push("30");
        for(String s : stack) {
            System.out.println(s);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
