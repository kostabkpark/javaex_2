package exercise.chapter8;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Dice().roll());
        }
    }
}

class Dice {
    int roll() {
        //return (int)(Math.random() * 6 + 1);
        Random r = new Random();
        return r.nextInt(6) + 1;// 0 ~ 5 ==> 1 ~ 6
    }
}

