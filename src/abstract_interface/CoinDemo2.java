package abstract_interface;

public class CoinDemo2 implements Coin {
    public static void main(String[] args) {
        // 인터페이스를 상속받아서 만든 클래스 안에서는 상수 이름만으로 사용 가능
        System.out.println("Dime 은 " + DIME + " 센트입니다.");
        System.out.println("Quarter는 " + QUARTER + " 센트입니다.");
    }
}
