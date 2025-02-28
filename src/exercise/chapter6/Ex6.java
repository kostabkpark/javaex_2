package exercise.chapter6;

public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle v = c;
    System.out.println(v.color);
    System.out.println(v.speed);
    //System.out.println(v.displacement);
    //System.out.println(v.gears);
    v.show(); // 자식 클래스의 show() 로 오버라이딩 되었기 때문에 parent 로는 볼 수 없는 필드도 출력가능
  }
}

class Vehicle {
  // 필드 - 자동차 색상, 자동차 속도
  String color;
  int speed;
  // 생성자

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  // 메서드 - 필드값 출력
  void show(){
    System.out.printf("색상 - %s, 속도 - %d \n", color, speed);
  }
}

class Car extends Vehicle {
  // 필드 - 자동차 배기량, 자동차 기어 단수
  int displacement;
  int gears;
  // 생성자

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  // 메서드 - 필드값 출력

  @Override
  void show(){
    System.out.printf("색상 - %s, 속도 - %d, 배기량 - %d, 기어 단수 - %d \n",
        color, speed, displacement, gears);
  }
}