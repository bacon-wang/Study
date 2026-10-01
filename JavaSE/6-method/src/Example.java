public class Example {
    private static int moveCount = 0;

    public static void hanoi(int n, char from, char buffer, char to) {
        if (n == 1) {
            // 基本情况：直接移动
            move(from, to);
            return;
        }

        // 1. 把n-1个盘子从from移到buffer（借助to）
        hanoi(n - 1, from, to, buffer);

        // 2. 把最大盘从from移到to
        move(from, to);

        // 3. 把n-1个盘子从buffer移到to（借助from）
        hanoi(n - 1, buffer, from, to);
    }

    private static void move(char from, char to) {
        moveCount++;
        System.out.println("第" + moveCount + "步: " + from + " -> " + to);
    }

    public static void main(String[] args) {
        int n = 40;
        hanoi(n, 'A', 'B', 'C');
        System.out.println("\n总共移动: " + moveCount + " 步");
    }

    static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    static void main() {
        System.out.println(fib(10));
    }

    static int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + (digitSum(n / 10));
    }

    static void main4() {
        System.out.println(digitSum(1234));
    }

    static void printDigit(int n) {
        if (n == 0) return;
        printDigit(n / 10);
        System.out.println(n % 10);
    }

    static void main3() {
        printDigit(1234);
    }

    static int recursiveSum(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    static void main2() {
        System.out.println(recursiveSum(5));
    }

    static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    static void main1() {
        System.out.println(factorial(5));
    }
}
