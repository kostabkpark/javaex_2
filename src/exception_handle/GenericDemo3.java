package exception_handle;

public class GenericDemo3 {
    public static void main(String[] args) {
        Cup<Boricha> c = new Cup<>();
        Boricha b = new Boricha();

        c.setBeverage(b);
        c.getBeverage().drinkBoricha();

        Beer beer = new Beer();
        //c.setBeverage(beer); Boricha 가 아닌 객체는 담을 수 없다.

        Cup<Beer> cBeer = new Cup<>();
        cBeer.setBeverage(beer);
        cBeer.getBeverage().drinkBeer(); // 불필요한 타입 체크가 필요없다.
    }
}
