import java.lang.reflect.Array;
import java.util.Scanner;

public class Example {
    static int MAX_TRY = 3;

    static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    static double max(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    static void main() {
        System.out.println(max(10, 2));
        System.out.println(max(1.23,2.34, 3.45));
    }


    static long fib(int num) {
        long prev = 0; // fib(0)
        long curr = 1; // fib(1)

        for (int i = 0; i < num; ++i) {
            long next = prev + curr; // fib(2) = fib(0) + fib(1)

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static long factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    static void simulateLogin() {
        String passwd = "123abc";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count++ < MAX_TRY) {
            if (scanner.nextLine().equals(passwd)) {
                System.out.println("login success!");
                return;
            }

            System.out.println("password wrong, please try again(" + count + "/" + MAX_TRY + ")");
        }
    }

    static void printDigit(int num) {
        Array arr;
        while (num > 0) {

            System.out.print(num % 10 + " ");
            num /= 10;
        }
    }

    static void main7() {
        System.out.println(fib(150));
    }

    static void main6() {
        System.out.println(factorial(5));
    }

    static void main5() {
        simulateLogin();
    }

    static void main4() {
        printDigit(1234);
    }

    static void main3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入单词：");
        System.out.println(scan. next());
        System.out.println(scan.nextDouble());
        System.out.println(scan.nextDouble());
    }

    static void main2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入小数：");
        System.out.println(scan.nextDouble());
        System.out.println(scan.nextDouble());
        System.out.println(scan.nextDouble());

    }

    static void main1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入数字：");
        // 遇到空白字符才会停，若只输入一个数字，则会阻塞等待后续输入
        // 如果输入非 int 会报错
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt()); // 输入:"1 2 3" 或 "1\n2\n3\n"
    }

}
