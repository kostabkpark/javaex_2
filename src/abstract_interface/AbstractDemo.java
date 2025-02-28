package abstract_interface;

public class AbstractDemo {
    public static void main(String[] args) {
        //Shape shape = new Shape();
    }
}

// 추상 클래스 - 다른 클래스를 만들때 도움을 줄 목적으로 만드는 클래스
abstract class Shape {
    // 필드
    double pi = 3.14;
    // 메서드 -- 넓이를 구하는 메서드도 다른 클래스들이 반드시 포함하도록 수정해보기
    abstract double findArea();
//    public double findArea(){
//        return 0.0;
//    }
    // 추상 메서드
    abstract void draw();
}

class Circle extends Shape {
    @Override
    double findArea() {
        return 0;
    }

    @Override
    void draw() {

    }
}

class Rectangle extends Shape {
    @Override
    double findArea() {
        return 0;
    }

    @Override
    void draw() {

    }
}