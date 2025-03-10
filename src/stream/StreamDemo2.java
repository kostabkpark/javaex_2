package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        // IntStream, DoubleStream, LongStream - 숫자 스트림 : average(), sum(), 통계 메서드를 제공
        int[] iarr = {1,2,3,4,5}; // 배열, 공간적 집합체
        IntStream iStream = Arrays.stream(iarr); // IntStream 이라는 시간적 집합체
        System.out.println(iStream.sum() + ":");
        iStream = Arrays.stream(iarr);
        System.out.println(iStream.average());
        double[] darr = {1.0, 2.0, 3.0, 4.0};
        DoubleStream dStream = Arrays.stream(darr);// DoubleStream 이라는 시간적 집합체
        
        long[] larr = {1L, 2L, 3L, 4L};
        LongStream lStream = Arrays.stream(larr);// LongStream 이라는 시간적 집합체

        IntStream intStream = IntStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0);

        // 객체 Stream -
        List<Integer> ilist = Arrays.asList(1,2,3,4,5); // List , 공간적 집합체
        Stream<Integer> stream1 = ilist.stream();// 객체 stream 이라는 시간적 집합체

        String[] sarr = {"a", "b", "d", "c"};
        Stream<String> stream2 = Arrays.stream(sarr);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); // 객체스트림

    }
}
