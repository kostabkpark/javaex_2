package collection_framework;

import java.util.Collection;
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

        Collection<Integer> values = fruits.values();
     //   for (int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i)); (X)
        //    System.out.println(values[i]); (X)
            //values.remove(30); (O)
     //   }
        for (Integer value : values) {
            System.out.println(value);
        }
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
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return hashCode() == fruit.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
