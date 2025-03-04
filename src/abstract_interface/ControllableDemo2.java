package abstract_interface;

public class ControllableDemo2 {
    public static void main(String[] args) {
        test(new TV()); // tv 테스트
        test(new Computer()); // computer 테스트
        test(new NoteBook()); // notebook 테스트
    }

    // 매개변수를 인터페이스로 주고, (tv, computer, notebook 객체를 이용)형변환과
    // 다형성을 테스트해보세요.
    public static void test(Controllable con) {
        // 장비를 켠다. 끈다. 수리한다 의 기능을 테스트하는 메서드
        con.turnOn();
        con.turnOff();
        con.repair();
    }
}
