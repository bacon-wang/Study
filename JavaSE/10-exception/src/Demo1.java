import java.nio.channels.UnresolvedAddressException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Demo1 {
    static int func1() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(func1());
    }

    static int getInt() {
        try (Scanner scanner = new Scanner(System.in)) { // 会被自动回收
            int ret = scanner.nextInt();
            return ret;
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        return -1;
    }

    static int getInt1() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int ret = scanner.nextInt();
            return ret;
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("finally");
        }

        return -1;
    }

    public static void main9(String[] args) {
        System.out.println(getInt());
    }


    static void changeArr(int[] arr) throws RuntimeException {
        if (arr == null) {
            throw new NullPointerException("空指针！");
        }

//        int index = arr.length; // 假设这里是经过业务计算得到的下标
//        if (index < 0 || index >= arr.length) {
//            throw new ArrayIndexOutOfBoundsException("越界");
//        }

        // change array

        // test
        throw new UnresolvedAddressException();
    }

    public static void main8(String[] args) {
        try {
            int[] arr = {1, 2, 3};
//            changeArr(null); // 空指针
//            changeArr(arr); // 越界
            changeArr(arr);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("main 捕获了 changeArr 中的 NullPointerException 异常：" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("main 捕获了 changeArr 中的 ArrayIndexOutOfBoundsException 异常：" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("main 捕获了 changeArr 中的 RuntimeException 异常（兜底）：" + e.getMessage());
        } finally {
            System.out.println("finally 执行了");
        }
    }

    public static void main7(String[] args) {
        try {
            int[] arr = {1, 2, 3};
//            changeArr(null); // 空指针
            changeArr(arr); // 越界
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) { // 不建议
            e.printStackTrace();
            System.out.println("main 捕获了 changeArr 中的 NullPointerException/ArrayIndexOutOfBoundsException 异常：" + e.getMessage());
        }
    }

    public static void main6(String[] args) {
        try {
            int[] arr = {1, 2, 3};
//            changeArr(null); // 空指针
            changeArr(arr); // 越界
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("main 捕获了 changeArr 中的 NullPointerException 异常：" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("main 捕获了 changeArr 中的 ArrayIndexOutOfBoundsException 异常：" + e.getMessage());
        }
    }

    static int dividedByTen(int a) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("不可除 0");
        }

        return a / 10;
    }

    public static void main5(String[] args) {
        try {
            System.out.println(dividedByTen(0));
            changeArr(null);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("main 捕获了 dividedByTen 中的 ArithmeticException 异常：" + e.getMessage());
        }
    }

    public static void main4(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        Student s2 = (Student) s1.clone(); // Unhandled exception: java.lang.CloneNotSupportedException
    }

    static void func() {
        func();
    }

    public static void main3(String[] args) {
        func();
    }

    public static void main2(String[] args) {
        int ret = 10 / 0;
    }

    public static void main1(String[] args) {
        int[] arr = null;
        arr[1] = 10;
    }
}
