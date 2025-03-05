package default_package;

public class GarbageDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Garbage(i);
            System.gc();
        }

    }
}
