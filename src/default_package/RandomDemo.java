package default_package;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(3)); // 0 부터 (3-1) 까지의 랜덤 정수를 반환
        }
    }
}
