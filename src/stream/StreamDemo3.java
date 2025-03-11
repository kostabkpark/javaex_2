package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamDemo3 {
    public static void main(String[] args) {
        IntStream iterate = IntStream.iterate(0, x -> x + 10); // 무한생성
        //iterate.forEach(x -> System.out.println(x)); // 무한루프에 빠진다.
        System.out.println("iterate 중간연산 테스트");
        iterate.limit(2).forEach(x -> System.out.println(x));

        Random r = new Random();

        System.out.println("randInt 중간연산 테스트");
        IntStream ints = r.ints(); // 무한생산
        //ints.forEach(x -> System.out.println(x)); // 무한루프에 빠진다.
        ints.limit(3).forEach(x -> System.out.println(x));

        System.out.println("nextInt 중간연산 테스트");
        IntStream generate = IntStream.generate(() -> new Random().nextInt(10)); // 무한생산
        //generate.forEach(System.out::println); // 무한루프에 빠진다.
        generate.limit(4).forEach(System.out::println);

        IntStream range = IntStream.range(1, 10); // 1,2,3,4,5,6,7,8,9 를 한번씩 생성 - end 10 불포함
        range.forEach(System.out::println);

        LongStream range1 = LongStream.range(1, 10);// 유한생성 - end 10 불포함
        range1.forEach(System.out::println);

        LongStream range2 = LongStream.rangeClosed(1, 10); // 유한생성 - end 10 포함
        range2.forEach(System.out::println);
    }
}
