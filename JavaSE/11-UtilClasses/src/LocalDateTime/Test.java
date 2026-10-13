package LocalDateTime;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Test {
    // 构造
    public static void main1(String[] args) {
        // 当前日期时间
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        // 指定日期时间
        LocalDateTime localDateTime2 = LocalDateTime.of(2026, 10, 3, 11, 26);
        System.out.println(localDateTime2);

        // 从字符串解析
        LocalDateTime localDateTime3 = LocalDateTime.parse("2026-05-15T10:30:00");
        System.out.println(localDateTime2);
    }

    // 获取字段
    public static void main2(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();

        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
        System.out.println("时：" + hour);
        System.out.println("分：" + minute);
        System.out.println("秒：" + second);
    }

    // 自定义日期时间格式化器
    public static void main3(String[] args) {
        String stringDate = "2026-10-01 10:30:21";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(stringDate, dateTimeFormatter);
        System.out.println("解析后日期时间：" + localDateTime);
    }

    // 获取详细信息
    public static void main4(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("当前日期：" + localDateTime);
        System.out.println("本周第几天：" + localDateTime.getDayOfWeek());
        System.out.println("本月第几天：" + localDateTime.getDayOfMonth());
        System.out.println("本年第几天：" + localDateTime.getDayOfYear());
    }

    // 日期计算
    public static void main5(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前日期" + localDateTime);

        // 增减天数
        LocalDateTime localDateTime1 = localDateTime.plusDays(1);
        LocalDateTime localDateTime2 = localDateTime.minusDays(1);
        System.out.println("增加 1 天：" + localDateTime1);
        System.out.println("减少 1 天：" + localDateTime2);

        // 增减周数
        LocalDateTime localDateTime3 = localDateTime.plusWeeks(1);
        LocalDateTime localDateTime4 = localDateTime.minusWeeks(1);
        System.out.println("增加 1 周：" + localDateTime3);
        System.out.println("减少 1 周：" + localDateTime4);

        // 增减月数
        LocalDateTime localDateTime5 = localDateTime.plusMonths(1);
        LocalDateTime localDateTime6 = localDateTime.minusMonths(1);
        System.out.println("增加 1 月：" + localDateTime5);
        System.out.println("减少 1 月：" + localDateTime6);

        // 增减年数
        LocalDateTime localDateTime7 = localDateTime.plusYears(1);
        LocalDateTime localDateTime8 = localDateTime.minusYears(1);
        System.out.println("增加 1 年：" + localDateTime7);
        System.out.println("减少 1 年：" + localDateTime8);
    }

    // 获取相对时间
    public static void main(String[] args) {
        LocalDateTime currDateTime = LocalDateTime.now();

        // 相对周一
        LocalDateTime monday = currDateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        System.out.println(monday);

        // 相对周天
        LocalDateTime sunday = currDateTime.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        System.out.println(sunday);

        // 相对月头
        LocalDateTime monthStart = currDateTime.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(monthStart);

        // 相对月尾
        LocalDateTime monthEnd = currDateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(monthEnd);

    }

}
