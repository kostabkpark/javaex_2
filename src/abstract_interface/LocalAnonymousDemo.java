package abstract_interface;

public class LocalAnonymousDemo {
    public static void main(String[] args) {
        Bird b = new Bird() {
            @Override
            void move() {
                System.out.println("참새가 난다.");
            }
        };

        b.move();
    }
}
