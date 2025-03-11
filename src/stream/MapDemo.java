package stream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("abc","bbb", "cd", "deeeeeee", "effff");
        Stream<String> s2 = s1.map(s -> s.toUpperCase()); // 대소문자변환
        Stream<Integer> is = s2.map(s -> s.length());// 길이를 구해서 숫자로 변환
        Stream<String> s11 = Stream.of("abc","bbb", "cd", "deeeeeee", "effff");
        Stream<String> s3 = s11.map(s -> s.substring(0,1)); // 중간을 잘라내서 문자열로 변환 (앞자리 하나만 substring 을 이용해서 잘라내기)
        s3.forEach(System.out::println);

        Stream<Integer> i1 = Stream.of(1,2,3,4,5);
        Stream<String> i2 = i1.map(i -> i + "" );
        Stream<Integer> i3 = i2.map(s -> Integer.parseInt(s)); // 문자열을 숫자로 변환
        Stream<Integer> i4 = i3.map(i -> i * 10);
        i4.forEach(System.out::println);


        Stream<Integer> i21 = Stream.of(1,2,3,4,5);
        // Stream<Integer> ==> IntStream : mapToInt()
        // Stream<Integer> ==> DoubleStream : mapToDouble()
        DoubleStream doubleStream = i21.mapToDouble(i -> (double) i);
        // IntStream ==> Stream<Integer> , Stream<String> : mapToObj()
        Stream<String> stringStream = doubleStream.mapToObj(d -> d + "");
        stringStream.forEach(Util::printWithParenthesis);

    }
}
