package abstract_interface;

public class RemoteController implements RemoteControllable{
    @Override
    public void remoteOn() {
        System.out.println("리모컨으로 켜다.");
    }

    @Override
    public void remoteOff() {
        System.out.println("리모컨으로 끄다.");
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
