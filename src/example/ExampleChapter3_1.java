package example;

public class ExampleChapter3_1 {
  public static void main(String[] args) {
    int x = 10, y = 20;
    int z = (++x) + (y--);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }
}
