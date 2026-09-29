import java.util.Random;
import java.util.Scanner;

public class Example {
    static boolean isNarcissisticNumber(int num) {
        // 提取每个数，并累加立方和
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += Math.pow(temp % 10, 3);
            temp /= 10;
        }

        return sum == num;
    }

    static void fracCal() {
        double ret = 0f;
        double flag = 1;
        for (int i = 1; i <= 100; i++) {
            ret += (flag) * (1/i);
        }

        System.out.println(ret);
    }

    static long gcd(int num1, int num2) {
        // 欧几里得算法：两个数的最大公约数，等于“较小数”和“余数”的最大公约数
        long a = Math.abs((long)num1);
        long b = Math.abs((long)num2);

        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    static int gcd1(int num1, int num2) {
        int min = num1 > num2 ? num2 : num1;
        int ret = -1;

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0 && i > ret) {
                ret = i;
            }
        }

        return ret;
    }

    static int nineCount(int begin, int end) {
        int count = 0;
        for (int i = begin; i < end; i++) {
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                if (digit == 9) {
                    count++;
                }
            }
        }

        return count;
    }

    static boolean isLeapYear(int year) {
        if (year <= 0) {
            return false;
        }

        boolean cond1 = year % 4 == 0 && year % 100 != 0;
        boolean cond2 = year % 400 == 0;
        return cond1 || cond2;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void guess() {
        Scanner scanner = new Scanner(System.in); // 创建输入对象
        Random random = new Random();
        int target = random.nextInt(100) + 1; // 生成1-100之间的随机数
        int guess = 0;
        while (target != guess) {
            System.out.print("你猜的是:> ");
            guess = scanner.nextInt();

            if (target > guess) {
                System.out.println("猜小了");
            } else if (target < guess) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了，答案是" + target);
            }
        }
    }

    static void main7() {
        int n = 200;
        for (int i = 0; i <= n; ++i)  {
            System.out.println(i + ": " + isNarcissisticNumber(i));
        }
    }

    static void main6() {
        fracCal();
    }

    static void main5() {
        System.out.println(gcd(12, 18));
    }

    static void main4() {
        System.out.println(nineCount(1, 101));
    }

    static void main3() {
        for (int i = 1000; i <= 2000; i++) {
            if (isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }

    static void main2() {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static void main() {
        guess();
    }
}
