package abstract_interface;

public class NoteBook extends Computer implements Portable{
    @Override
    public void inMyBag() {
        System.out.println("노트북은 내 가방안에 있다.");
    }

    @Override
    public void turnOn() {
        System.out.println("노트북을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("노트북을 끈다.");
    }

    @Override
    public void repair() {
        System.out.println("노트북을 수리한다.");
    }
}
