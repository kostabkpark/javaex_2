package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException, NullPointerException {
//  특정 리소스를 사용 후 close 를 해야 하는 경우 try~catch~finally
        //        FileInputStream is = null;
//        try {
//            is = new FileInputStream("test.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            is.close();
//        }

        // try~with~resource , jdk9 >
        FileInputStream is = new FileInputStream("test.txt");
        try (is) {
            // ~~~~
        } catch (FileNotFoundException e) {
            // ~~~~
        }

    }
}
