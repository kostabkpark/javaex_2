package abstract_interface;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m.myClassInt);
        m.sayHello();
        System.out.println(MyInterface.MAX);
        System.out.println(YourInterface.MIN);

        MyClass2 m2 = new MyClass2();
        m2.sayHello();

        NewClass newClass = new NewClass();
        newClass.myNameIs();
    }
}
