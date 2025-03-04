package abstract_interface;

/**
 * @implSpec turnOn - 전자제품의 전원을 켜는 기능으로 반드시 구현되어야 함.
 * @param - none
 * @return - void
 * @throws - NullPointerException
 */
public interface Controllable {
    // 필수 기능 - abstract (반드시 포함하도록)
    void turnOn();
    void turnOff();
    // 기능이 구현되어 있는 경우 - 오버라이딩 가능한 경우
    default void repair(){
        printInformation("전자제품을 수리한다.");
    }
    // 기능이 구현되어 있는 경우 - 오버라이딩 대상이 아닌 경우
    static void reset(){
        System.out.println("전자제품을 초기화한다.");
    }
    // 기능이 구현되어 있는 경우 - 인터페이스 내부에서만 사용하고 구현이나 상속의 대상이 아닌 경우
    private void printInformation(String information) {
        System.out.println(information);
    }
}
