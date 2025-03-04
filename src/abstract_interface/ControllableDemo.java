package abstract_interface;

public class ControllableDemo {
    public static void main(String[] args) {
        Controllable c = new Computer();
        c.turnOn();
        c.turnOff();
        c.repair();
        Controllable n = new NoteBook();
        n.turnOn();
        n.turnOff();
        n.repair();
        Controllable tv = new TV();
        tv.turnOn();
        tv.turnOff();
        tv.repair();

        Controllable[] controllables = {
                new TV(),
                new Computer(),
                new NoteBook()
        };
        System.out.println("========================");
        for(Controllable controllable : controllables) {
            controllable.turnOn();
            controllable.turnOff();
            controllable.repair();
        }
    }
}
