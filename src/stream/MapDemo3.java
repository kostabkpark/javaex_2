package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {
    public static void main(String[] args) {
        String s = "hello java";
        String s2 = "hi, my name is";
        String[] s1 = s.split(" ");
        String[] s3 = s2.split(" ");

        Arrays.stream(s1);
        System.out.println(s1.length);
        System.out.println(s3.length);

        List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
        Stream<String> list2 = list1.stream();
        Stream<String> stringStream = list2.flatMap(str -> Arrays.stream(str.split(" ")));
        stringStream.forEach(Util::printWithParenthesis);

        List<String> list11 = List.of("안녕, 자바!", "잘 가, C++!");
        list11.stream().sorted();
    }
}
