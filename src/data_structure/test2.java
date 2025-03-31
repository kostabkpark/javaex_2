package data_structure;

public class test2 {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    //thread.run();
    thread.start();

    MyThread thread2 = new MyThread();
    //thread2.run();
    thread2.start();

    A a = new A();
    a.run();
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.print(Thread.currentThread().getName()
        + " 실행 중 \t");
  }
}

class A {
  public void run() {
    int n = 5/0;
    System.out.println("나는 실행됩니다.");
  }
}
