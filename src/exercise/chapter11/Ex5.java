package exercise.chapter11;

import java.util.HashMap;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
        Map<String, String> map2 = new HashMap<>(map);
        System.out.println(map2);
        map2.replaceAll((key,value) -> value.toUpperCase());
        System.out.println(map2);

    }
}
