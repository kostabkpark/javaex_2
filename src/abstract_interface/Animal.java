package abstract_interface;

public interface Animal {
    // 반드시 포함되어야 하는 기능
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}

class Cuckcoo implements Animal{
    @Override
    public void sound() {
        System.out.println("뻐꾹!");
    }
}
