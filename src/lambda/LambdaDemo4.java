package lambda;

public class LambdaDemo4 {
    public static void main(String[] args) {
        DiceFunction d = new DiceFunction() {
            @Override
            public int roll() {
                return (int)(Math.random() * 6) + 1;
            }
        };

        System.out.println(d.roll());

        DiceFunction d2 = () -> (int)(Math.random() * 6) + 1;
        System.out.println(d2.roll());
    }
}


@FunctionalInterface
interface DiceFunction {
    int roll();
}
