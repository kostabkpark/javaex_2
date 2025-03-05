package exercise.chapter8;

import java.util.Calendar;

public class Ex3 {
    public static void main(String[] args) {
        String[] weekName = {"일","월","화","수","목","금","토"};
        String[] noonName = {"오전", "오후"};

        Calendar c = Calendar.getInstance();

        // 코드 추가
        int year = c.get(Calendar.YEAR);
  //      System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;
 //       System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
//        System.out.println(day);

        int weekNo = c.get(Calendar.DAY_OF_WEEK);
       //System.out.println(weekNo);
        String week = weekName[weekNo - 1];
        //System.out.println(weekName[weekNo - 1]);

        int noonNo = c.get(Calendar.AM_PM);
        //System.out.println(noonNo);
        String noon = noonName[noonNo];
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
