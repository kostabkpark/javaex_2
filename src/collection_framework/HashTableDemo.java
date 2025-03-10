package collection_framework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<Fruit, Integer> fruits = new Hashtable<>();

        Fruit apple = new Fruit("사과");
        Fruit banana = new Fruit("바나나");
        fruits.put(apple, 5);
        fruits.put(banana, 3);
        fruits.put(banana, 30);
        fruits.put(apple, 50);
        fruits.put(new Fruit("딸기"), 2);
        //fruits.put(null, 10); // hashtable 은 널 값을 키, 값으로 가질 수 없다.
        //fruits.put(new Fruit("딸기"), null); // hashtable 은 널 값을 키, 값으로 가질 수 없다.
        System.out.println(fruits.get(apple));
        System.out.println(fruits);
    }
}
