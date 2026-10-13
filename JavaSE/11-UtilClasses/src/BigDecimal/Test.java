package BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Test {
    public static void main1(String[] args) {
        BigDecimal doubleNum = new BigDecimal(1.99); // 传入的参数本身已经不精确
        System.out.println(doubleNum);

        BigDecimal stringNum = new BigDecimal("19.99");
        System.out.println(stringNum);
    }

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("6.35");
        BigDecimal y = new BigDecimal("2.13");

        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        try {
//            System.out.println(x.divide(y)); // exception
            System.out.println(x.divide(y, 4, RoundingMode.HALF_UP)); // 保留 4 位，四舍五入
            System.out.println(x.divide(y, new MathContext(5, RoundingMode.HALF_UP)));
        } catch (ArithmeticException e) {
            System.out.println("算数异常：" + e.getMessage());
        }
    }
}
