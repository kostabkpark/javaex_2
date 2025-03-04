package abstract_interface;

// 인터페이스는 인터페이스끼리 상속
public interface YourInterface extends MyInterface {
    int MIN = 0;
    void sayHello2();
}

// 클래스는 인터페이스를 구현
class MyClass implements MyInterface{
    int myClassInt = 1;
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}

class MyClass2 implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}

class YourClass implements YourInterface{
    int yourClassInt = 10;
    @Override
    public void sayHello2() {
        System.out.println("hello2");
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}