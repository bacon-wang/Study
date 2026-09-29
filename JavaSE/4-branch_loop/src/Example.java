import java.util.Scanner;

public class Example {
    static void main() {
        Scanner scanner = new Scanner(System.in); // 创建输入对象
        int target = 20;
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
}
