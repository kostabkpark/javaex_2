package example;

public class ExampleChapter2_5 {
  public static void main(String[] args) {
    byte byteValue = 10;
    char charValue = 'A';

    int intValue = byteValue;
    intValue = charValue;
    double doubleValue = byteValue;

    short shortValue = (short)charValue;
  }
}
