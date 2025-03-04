package abstract_interface;

public class LocalClassDemo {
    public static void main(String[] args) {
        class Eagle extends Bird {
            @Override
            void move() {
                System.out.println("독수리가 난다.");
            }
        }

        Bird b = new Eagle();
        b.move();
    }
}
