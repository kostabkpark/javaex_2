package thread;

public class DaemonDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(task, "작업 스레드");
        thread.setDaemon(true); // 작업 스레드를 Daemon 스레드로 변경
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName());
    }
}
