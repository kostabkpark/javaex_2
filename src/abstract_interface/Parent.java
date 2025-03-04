package abstract_interface;

//public class NestedClass { // 외부 클래스, Parent
//    class InnerClass { // 멤버 클래스 , OnlyOnce
//
//    }
//}
//
public class Parent {

    class OnlyOnce extends Parent {
        @Override
        void method1(){
            System.out.println("한 번만 호출됩니다.");
        }
    }
    void method1(){
        System.out.println("부모입니다.");
    }
}





