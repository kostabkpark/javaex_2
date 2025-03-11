package exercise.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex6 { // 이것이 자바다 15장 9번 문제
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        String name2 = null; // 최저 점수를 받은 아이디를 저장하는 변수
        int minScore = 100; // 최저 점수를 저장하는 변수


        Set<String> names2 = map.keySet();
        for (String nm2 : names2) {
            int score = map.get(nm2);
            if (minScore > score) {
                minScore = score;
                name2 = nm2;
            }
        }
        System.out.println(name2 + "이 최저점수" + minScore + " 를 받았습니다.");

        // < 방법 1>
        Set<String> names = map.keySet();
        for (String nm : names) {
            int score = map.get(nm);
            totalScore += score;
            if(maxScore < score) {
                maxScore = score;
                name = nm;
            }
        }
        System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
        System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());

        // < 방법 2> - entrySet<> 활용
        name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        maxScore = 0; // 최고 점수를 저장하는 변수
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
                int score = entry.getValue();
                totalScore += score;
                if(maxScore < score) {
                    maxScore = score;
                    name = entry.getKey();
            }
        }
        System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
        System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());


        // < 방법 3> - entrySet().iterator() 활용
        name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        maxScore = 0; // 최고 점수를 저장하는 변수
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            int score = entry.getValue();
            totalScore += score;
            if(maxScore < score) {
                maxScore = score;
                name = entry.getKey();
            }
        }
        System.out.println(name + "이 최고점수" + maxScore + " 를 받았습니다.");
        System.out.printf("평균 점수는 %.2f \n", totalScore / (double)names.size());

    }
}
