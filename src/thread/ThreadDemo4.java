package thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread ct = Thread.currentThread();
                ct.setPriority(1);
                System.out.println(ct.getName() + "," + ct.getPriority());

            }
        });
        thread.start(); // thread.run(); 비교
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread ct = Thread.currentThread();
                ct.setPriority(1);
                System.out.println(ct.getName() + "," + ct.getPriority());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread ct = Thread.currentThread();
                ct.setPriority(1);
                System.out.println(ct.getName() + "," + ct.getPriority());
            }
        }).start();

        Thread ct = Thread.currentThread();
        ct.setPriority(10);
        System.out.println(ct.getName() + "," + ct.getPriority());
    }
}
