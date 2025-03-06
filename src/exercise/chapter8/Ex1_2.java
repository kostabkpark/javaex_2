package exercise.chapter8;

import java.util.Objects;

public class Ex1_2 {
    public static void main(String[] args) {
        Person p1 = new Person("111111", "홍길동");
        Person p2 = new Person("111111", "손흥민");
        Person p3 = new Person("123456", "손흥민");
        Person p4 = new Person("123456", "손흥민");

        if(p1.equals(p2))
            System.out.println("같은 사람이다.");
        else
            System.out.println("다른 사람이다.");

        if(p3.equals(p4))
            System.out.println("같은 사람이다.");
        else
            System.out.println("다른 사람이다.");
    }
}

class Person {
    String juminNumber;
    String name;

    public Person(String juminNumber, String name) {
        this.juminNumber = juminNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.hashCode() == person.hashCode();
    }

    @Override
    public int hashCode() {
        // return juminNumber.hashCode() + name.hashCode();
        // 비교하고자 하는 모든 필드의 hash 값을 구하도록 전부 연산에 참여시켜서 hash 값을 반환
        return Objects.hash(juminNumber, name);
    }
}
