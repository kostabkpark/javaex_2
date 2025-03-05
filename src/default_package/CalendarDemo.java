package default_package;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int day = cal.get(Calendar.DATE);
        System.out.println(day);

        int month = cal.get(Calendar.MONTH);
        System.out.println(month);
    }
}
