package thread;

public class InterruptDemo2 {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("실행 중...");
            }
            System.out.println("정상 종료되었습니다.");
        };

        Thread thread = new Thread(task, "쓰레드");
        thread.start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }

        thread.interrupt();
    }
}
