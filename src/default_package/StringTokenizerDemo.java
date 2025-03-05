package default_package;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(s, "," , false);
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
