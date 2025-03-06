package lambda;

public class LambdaDemo3 {
    public static void main(String[] args) {
        SquareFunction s = new SquareFunction() {
            @Override
            public int square(int x) {
                return x * x;
            }
        };
        System.out.println(s.square(3));

        SquareFunction s2 = x -> x * x;
        System.out.println(s2.square(3));
    }
}


@FunctionalInterface
interface SquareFunction {
    int square(int x);
}