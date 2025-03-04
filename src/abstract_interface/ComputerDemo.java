package abstract_interface;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer c = new Computer();
        Computer c1 = new Computer();

        c.turnOn();
        c.turnOff();

        NoteBook nb = new NoteBook();
        nb.turnOn();
        nb.turnOff();
        nb.inMyBag();
        nb.repair();
        Controllable.reset();
    }
}
