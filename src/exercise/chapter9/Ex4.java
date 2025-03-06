//package exercise.chapter9;
//
//public class Ex4 {
//    public static void main(String[] args) {
//        Container<String> container1 = new Container<String>();
//        container1.set("홍길동");
//        String str = container1.get();
//
//        Container<Integer> container2 = new Container<Integer>();
//        container2.set(6);
//        int value = container2.get();
//    }
//}
//
//class Container<T> {
//    T t ;
//    public void set(T t) {
//        this.t = t;
//        // return; 컴파일러가 자동으로 추가해줌.
//    }
//    public T get() {
//        return t;
//    }
//}