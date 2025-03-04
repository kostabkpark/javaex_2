package abstract_interface;

public class AnonymousDemo {
    Bird b = new Bird() {
        @Override
        void move() {
            System.out.println("어떤 새가 난다.");
        }

        void sound(){
            System.out.println("소리를 낸다.");
        }
    };

    public static void main(String[] args) {
        AnonymousDemo a = new AnonymousDemo();
        a.b.move();
        //a.b.sound();
    }
}
