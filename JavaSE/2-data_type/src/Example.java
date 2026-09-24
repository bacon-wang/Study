public class Example {
    static void main1() {
        byte b = 10;

        System.out.println(b);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }

    static void main2() {
        char ch1 = 'a';
        char ch2 = 97;
        char ch3 = '乐'; // 汉字是 2 字节，Java 中 Char 可以存储一个汉字！

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    static void main3() {
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 1; // error

        System.out.println(b1);
        System.out.println(b2);
    }

    static void main4() {
        int a = 10;
        long b = 20L;

//        b = a; // long 到 int，8 字节到 4 字节，ok
//        a = b; // int  到 long，4 字节到 8 字节，err

        // 自动类型转换
        b = a;

        // 强制类型转换（有风险：可能截断导致丢失数据）
        a = (int)b;
    }

    static void main5() {
        int a = 10;
        long b = 100L;

//        int result1 = a + b;
        long result2 = a + b;

    }

    static void main6() {
        byte a = 10;
        byte b = 20;

        // byte result = a + b; // err：所有小于 4 字节（如 byte）的数据，计算时都会提升为 4 字节，所以 a+b 是整形大小，，无法用 byte 接受
        byte result1 = (byte)(a + b);
        int result2 = a + b;
    }

    static void main7() {
        String str1 = "Hello";
        String str2 = "World!";

        String result = str1 + " "+ str2; // 拼接操作，而非纯粹加法运算
        System.out.println(result);
    }

    static void main8() {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + a + b);
        System.out.println("a + b = " + (a + b));
        System.out.println(a + b);
    }

    // int => String
    static void main9() {
        int num = 10;
        String str1 = num + "";
        String str2 = String.valueOf(num);

        System.out.println(str1);
        System.out.println(str2);
    }

    // String => int
    static void main() {
        String str = "1024";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
