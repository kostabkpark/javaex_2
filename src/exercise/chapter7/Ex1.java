package exercise.chapter7;

public class Ex1 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100,50);
        c.show();
    }
}

abstract class Abstract {
    int i;
    public Abstract(int i) {
        this.i = i;
    }
    abstract void show();
}

class Concrete extends Abstract{
    int i;

    public Concrete(int i, int i1) {
        super(i);
        this.i = i1;
    }

    @Override
    void show() {
        System.out.printf("부모의 필드 i = %d , Concrete 객체의 필드 i = %d \n", super.i, this.i );
    }
}