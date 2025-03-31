package data_structure;

public class Test {
  public static void main(String[] args) {
    int result1 =Calculator.add(5, 3);
    Calculator calculator = new Calculator();
    int result2 = calculator.multiply(4, 6);
    System.out.print(result1 + ",");
    System.out.print(result2);
  }
}



class Calculator {
  public static int add(int a, int b) { // 정적메서드
    return a + b;
  }
  int multiply(int a, int b) { // 인스턴스 메서드
    return a * b;
  }
}

