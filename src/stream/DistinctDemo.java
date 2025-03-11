package stream;

import java.util.stream.IntStream;

public class DistinctDemo {
    public static void main(String[] args) {
        IntStream is = IntStream.of(1, 2, 1, 3, 3, 2, 2, 4, 4);
        is.filter(i -> i%2 ==0) // 짝수만 걸러내기
                .distinct() // 중복 없애기
                .forEach(Util::printWithParenthesis); // 괄호로 감싸서 출력하
    }
}
