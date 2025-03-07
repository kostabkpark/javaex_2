package lambda;

import java.util.Arrays;

public class LambdaDemo5 {
    public static void main(String[] args) {
        String[] sArr = {
                "로마에 가면 로마법을 따르라.",
                "시간은 금이다.",
                "펜은 칼보다 강하다"
        };
        System.out.println("사전기준 정렬");
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));
        System.out.println("문자열의 길이 기준 정렬");
        Arrays.sort(sArr, (s1, s2) -> s2.length() - s1.length());
        System.out.println(Arrays.toString(sArr));

    }
}
