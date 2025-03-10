package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> fruits = null;
        try {
            fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            try{
                System.out.println(fruits.size() + "종류의 과일이 있습니다.");
            } catch (NullPointerException e) {
                System.out.println("자료 생성과정에서 오류가 발생했습니다.");
            }
        }
        System.out.println(fruits);


        Map<String, Integer> map = new HashMap<>(fruits);

        for (String key : fruits.keySet()) {
            System.out.println(key+"가 " + fruits.get(key) + " 개 있습니다.");
        }

        String fruit = "배";
        if(fruits.containsKey(fruit)) {
            System.out.println(fruit+"가 " + fruits.get(fruit) + " 개 있습니다.");
        } else {
            System.out.println(fruit+"가 " + " 없습니다.");
        }

        fruits.forEach((key ,value ) -> System.out.print(key + "(" + value + ") "));
       // fruits.replaceAll(( key, v1 ) ->  v1 * 10 ); immutable 이라 수정 불가
        // fruits.put("사과", 50);
        //fruits.remove("사과");
        //fruits.clear();
        map.put("사과", 50);
        System.out.println(fruits);
        System.out.println(map);
        map.remove("사과");
        System.out.println(map);
    }
}
