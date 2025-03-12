package thread;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕");
            try {
                Thread.sleep(500); // 0.5 초 동안의 delay
            } catch (InterruptedException e) {
            }
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() { // 스레드로 만들어졌을 때 할 일
        for (int i = 0; i < 5; i++) {
            System.out.println("잘 가");
            try {
                Thread.sleep(500); // 0.5 초 동안의 delay
            } catch (InterruptedException e) {
            }
        }
    }
}

