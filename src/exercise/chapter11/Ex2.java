package exercise.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        set.add(new Person("나자바", 11));

        Iterator<Person> iterator = set.iterator();
        while(iterator.hasNext()) {
            Person p = iterator.next();
            System.out.print(p.name + " : " + p.age + '\n');
        }

        iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" +
                name + " : " + age +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return hashCode() == person.hashCode() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}