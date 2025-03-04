package abstract_interface;

public class MovableDemo {
    public static void main(String[] args) {
        Movable m = new Car(); // 자동 형변환 , upcasting , 기능을 제한
        m.move(2);
        //m.show();
        // downCasting , 강제 형변환 , 기능을 되돌리기
        Car car = (Car)m;
        car.move(3);
        car.move(5);
        car.show();
    }
}
