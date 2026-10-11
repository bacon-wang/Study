package demo1;

public class Test {
    // String 构造
    public static void main1(String[] args) {
        // 1. 用字符串常量构造
        String str1 = "abc"; // 语法糖
        String str2 = new String("def");

        // 2. 用字符数组构造
        char[] chars = {'g', 'h', 'i'};
        String str3 = new String(chars);

        // 3. 用字节数组构造
        byte[] bytes = {'j', 'k', 'l'};
        String str4 = new String(bytes);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    // 字符串常量池 1
    public static void main2(String[] args) {
        String str1 = "abc"; // 1. 常量池中创建一个 String 内容为 "abc"，并让 str 引用这个 String
        String str2 = "abc"; // 2. 内容为 "abc" 的 String 已经存在，会复用

        // 比较二者所引用的对象是否相同
        System.out.println(str1 == str2);
    }

    // 字符串常量池 2
    public static void main3(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 二者指向同一个地址？false
        System.out.println(str1.equals(str2)); // 二者字符串内容相同？true
    }

    // 字符串比较
    // ==: 是否引用同一对象
    public static void main4(String[] args) {
        // 对于基本类型，== 比较变量存储的值
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a == b);
        System.out.println(a == c);

        // 对于引用类型，== 比较引用是否引用同一对象
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2); // 直接引用同一个字符串常量
        System.out.println(str3 == str4); // 直接引用的是各自堆上的 String 对象，对象内引用的才是字符串常量
    }

    // compareTo：比较内容大小
    public static void main5(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("ac");
        String str3 = new String("abc");
        String str4 = new String("abcdef");
        String str5 = new String("f");

        System.out.println(str1.compareTo(str2)); // 输出 abc 中 b 和  ac 中 c 的差值：-1
        System.out.println(str1.compareTo(str3)); // 输出 0（表示相同）
        System.out.println(str1.compareTo(str4)); // 输出长度差：-3
    }

    // compareToIgnoreCase：比较内容大小（忽略大小写）
    public static void main6(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("ABC");

        System.out.println(str1.compareToIgnoreCase(str2)); // 输出 0
    }

    // 字符串查找
    public static void main(String[] args) {
        String s = "Java is a great language";

        s.contains("great");        // true，是否包含某个子串
        s.startsWith("Java");       // true，是否以某字符串开头
        s.endsWith("language");     // true，是否以某字符串结尾

        s.indexOf("a");             // 1，第一次出现 "a" 的位置（下标从0开始）
        s.indexOf("a", 2);          // 从下标2开始找，返回 3
        s.lastIndexOf("a");         // 最后一次出现的位置

        s.indexOf("python");        // -1，找不到返回 -1，不是报错
    }
}
