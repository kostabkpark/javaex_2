package abstract_interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        tv.repair(); // 다형성 - interface vs. instance
        Controllable.reset();
        //tv.reset();

        RemoteController rc = new RemoteController();
        rc.remoteOn();
        rc.remoteOff();
    }
}
