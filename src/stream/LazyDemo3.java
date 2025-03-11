package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo3 {
    public static void main(String[] args) {
        IntStream is = IntStream.generate(() -> new Random().nextInt(10));

        is.filter(i -> {
            System.out.println("filter : " + i);
            return i % 2 ==0;
        }).limit(3)
            .map(x -> {
                System.out.println("map : " + x);
                return x * x;
            });

    }
}
