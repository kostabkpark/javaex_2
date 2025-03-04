package abstract_interface;

public interface ParentInterface {
    void method1();
    class OnlyOnce implements ParentInterface {
        @Override
        public void method1() {

        }
    }
}

