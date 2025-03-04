package abstract_interface;

public class TV implements Controllable{
    @Override
    public void turnOn() {
        System.out.println("TV 를 켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끄다.");
    }

    @Override
    public void repair() {
        System.out.println("TV를 수리한다.");
    }

//    @Override - 오버라이딩 할 수 없음
//    public static void reset(){
//
//    }
//    @Override - 오버라이딩 할 수 없음
//    private void printInformation(String information) {
//
//    }
}
