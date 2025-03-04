package abstract_interface;

interface MyInterface {
    // 상수 필드
    public static final int MAX = 10;
    // 추상메서드
    public abstract void sayHello();
    // 구현부가 있는 default 메서드(클래스로 상속 + 오버라이드 가능 ==> 다형성)
    default void myNameIs(){
        System.out.println("my name is newFunction");
    }
}

class NewClass implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void myNameIs() {
        System.out.println("my name is newClass");
    }
}




