package abstract_interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        tv.repair(); // 다형성 - interface vs. instance
        Controllable.reset();
        //tv.reset(); 인터페이스명.staticMethod() 로 호출해야 함.

        Computer com = new Computer();
        com.turnOn();
        com.turnOff();
        com.repair();

        RemoteController rc = new RemoteController();
        rc.remoteOn();
        rc.remoteOff();
    }
}
