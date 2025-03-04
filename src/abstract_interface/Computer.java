package abstract_interface;

public class Computer implements Controllable{
    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끄다.");
    }

    @Override
    public void repair() {
        System.out.println("컴퓨터를 수리한다.");
    }
}
