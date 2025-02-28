package exercise;

import java.util.Arrays;

public class EX4 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"}; //
    System.out.println(Arrays.toString(name)); //
    int index = 0; //
    for (int i = 0; i < 10; i++) {
      index = (int)(Math.random() * 3);//
      System.out.println(name[index]);
      // 0
      // 1
      // 2
    }
  }
}
