package exception_handle;

public class GenericDemo2 {
    public static void main(String[] args) {
        Cup c = new Cup();
        Beer beer = new Beer();
        c.setBeverage(beer);
        //c.getBeverage().drink();
        Beer b = (Beer)c.getBeverage();
        b.drinkBeer();

        Boricha boricha = new Boricha();
        c.setBeverage(boricha);
        Object o = c.getBeverage();
        if(o instanceof Beer) {
            Beer beer1  = (Beer)o; // 다운캐스팅할 때 클래스 타입이 맞지 않으면 발생하는 오류는 컴파일이 걸러주지 않는 실행오류
            beer1.drinkBeer();
        } else if(o instanceof Boricha) {
            Boricha boricha1 = (Boricha) o;
            boricha1.drinkBoricha();
        }
                                                   // 컴파일 할 때 걸러질 수 있는 오류로 만들기 위해 제네릭 클래스를 사용한다.


        Beverage beverage = new Beverage();
        c.setBeverage(beverage);
    }
}

class Cup<T>{
    private T beverage;

    public T getBeverage(){
        return beverage;
    }

    public void setBeverage(T beverage){
        this.beverage = beverage;
    }
}

//class Cup {
//    private Object beverage;
//
//    public Object getBeverage() {
//        return beverage;
//    }
//
//    public void setBeverage(Object beverage) {
//        this.beverage = beverage;
//    }
//}

class Beverage {

}

class Boricha extends Beverage {
    public void drinkBoricha() {
        System.out.println("보리차를 마신다.");
    }

}

class Beer extends Beverage {
    public void drinkBeer() {
        System.out.println("맥주를 마신다.");
    }
}