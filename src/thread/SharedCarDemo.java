package thread;

import java.util.Random;

public class SharedCarDemo {
    public static void main(String[] args) {
        SharedCar car = new SharedCar();
        new CarThread(car, "홍길동", "부산").start();
        new CarThread(car, "이강인", "광주").start();
        new CarThread(car, "차준환", "대전").start();
    }
}

class SharedCar {
    public synchronized void drive(String name, String city){
        System.out.println(name + " 님이 자동차에 탔습니다.");
        Random r = new Random();
        for (int i = 0; i < r.nextInt(3) + 1; i++) {
            System.out.println(name + " 님이 자동차를 운전합니다.");
        }
        System.out.println(name +" 님이 " + city + " 에 도착했습니다.");
    }

}

class CarThread extends Thread {
    private SharedCar car;
    private String name;
    private String city;

    public CarThread(SharedCar car, String name, String city) {
        this.car = car;
        this.name = name;
        this.city = city;
    }

    @Override
    public void run() {
        car.drive(name, city);
    }
}