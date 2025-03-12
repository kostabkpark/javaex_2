package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread thread = new WorkThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class WorkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("잘 가");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
