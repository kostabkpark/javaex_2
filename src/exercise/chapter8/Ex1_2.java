package exercise.chapter8;

import java.util.Objects;

public class Ex1_2 {
    public static void main(String[] args) {
        Person p1 = new Person("111111", "홍길동");
        Person p2 = new Person("111111", "손흥민");
        Person p3 = new Person("123456", "손흥민");

        if(p1.equals(p2))
            System.out.println("같은 사람이다.");
        else
            System.out.println("다른 사람이다.");

        if(p2.equals(p3))
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
        return Objects.hash(juminNumber, name);
    }
}
