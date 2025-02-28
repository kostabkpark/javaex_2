package exercise;

public class EX1 {
  public static void main(String[] args) {
    System.out.println(countChar("hello", 'l')); // ==> 2
    System.out.println(countChar("hello", 'L')); // ==> 2
  }

  public static int countChar(String s, char c){
    // 이 부분을 구현하세요.
    int count=0;
//    c = String.valueOf(c).toLowerCase().charAt(0);
//    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if(s.toUpperCase().charAt(i) == c || s.toLowerCase().charAt(i) == c) {
        count++;
      }
    }
    return count;
  }
}
