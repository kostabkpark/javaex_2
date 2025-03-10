package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Fruit, Integer> fruits = new HashMap<>();

        fruits.put(new Fruit("사과"), 5);
        fruits.put(new Fruit("바나나"), 3);
        fruits.put(new Fruit("바나나"), 30);
        fruits.put(new Fruit("사과"), 50);
        fruits.put(new Fruit("딸기"), 2);
        fruits.put(null, 10);

        System.out.println(fruits);
    }
}

class Fruit {
    String name;
    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit[" + name + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fruit fruit)) return false;
        return hashCode() == fruit.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
