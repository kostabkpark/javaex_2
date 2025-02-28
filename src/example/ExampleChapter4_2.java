package example;

public class ExampleChapter4_2 {
  public static void main(String[] args) {
    String grade = "B";
    int score1 = 0;
    switch (grade) {
      case "A":
        score1 = 100;
        break;
      case "B":
        int result = 100 - 20;
        score1 = result;
        break;
      default:
        score1 = 60;
    }
    System.out.println("score1 = " + score1);

    score1 = switch (grade) {
      case "A"  -> 100;
      case "B"  -> {
        int result = 100 - 20;
        score1 = result;
        yield score1;
      }
      default   -> 60;
    };
    System.out.println("score1 = " + score1);
  }
}
