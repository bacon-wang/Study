package Date;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(2026-1900, 10, 13);
        Date date2 = new Date(2026-1900, Calendar.NOVEMBER, 13);
        System.out.println(date);
        System.out.println(date2);
    }
}
