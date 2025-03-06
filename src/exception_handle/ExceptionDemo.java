package exception_handle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream is = null;
        BufferedInputStream bis = null;
        try
        {
            is = new FileInputStream("file.txt");
            bis = new BufferedInputStream(is);
            int data;
            while((data = bis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file을 찾을 수 없습니다.");
//        } catch (IOException e) {
//            System.out.println("입력처리 오류입니다.");
        } finally {
            if(is != null) is.close();
            if(bis != null) bis.close();
        }
    }
}
