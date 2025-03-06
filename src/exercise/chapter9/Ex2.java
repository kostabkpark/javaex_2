package exercise.chapter9;

public class Ex2 {
    public static void main(String[] args) {
        // Person (이름, 나이)
        // Person (주민번호, 이름)
        Person<String, Integer> p1 = new Person<>("홍길동", 20);
        Person<String, String> p2 = new Person<>("111111", "홍길동");

        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        System.out.println(p2.getKey());
        System.out.println(p2.getValue());
    }
}

class Person<A,B> {
    A key;
    B value;

    public Person(A key, B value) {
        this.key = key;
        this.value = value;
    }

    public A getKey() {
        return key;
    }

    public B getValue() {
        return value;
    }
}