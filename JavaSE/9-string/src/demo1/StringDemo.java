package demo1;

public class StringDemo {
    public static void main(String[] args) {
//        compare();
//        search();
//        convert();
//        replace();
//        split();
//        substring();
//        trim();
//        intern();
        performance();
    }

    // 1. 比较
    static void compare() {
        System.out.println("===== 比较 =====");
        String a = new String("hello");
        String b = new String("hello");
        System.out.println("a == b: " + (a == b));             // false，比较的是对象地址
        System.out.println("a.equals(b): " + a.equals(b));     // true，比较内容

        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("compareTo: " + s1.compareTo(s2));               // 负数，H(72) < h(104)
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2)); // 0
    }

    // 2. 查找
    static void search() {
        System.out.println("\n===== 查找 =====");
        String s = "Java is a great language";
        System.out.println("contains: " + s.contains("great"));       // true
        System.out.println("startsWith: " + s.startsWith("Java"));    // true
        System.out.println("endsWith: " + s.endsWith("language"));    // true
        System.out.println("indexOf a: " + s.indexOf("a"));           // 1
        System.out.println("indexOf a from 2: " + s.indexOf("a", 2)); // 3
        System.out.println("lastIndexOf a: " + s.lastIndexOf("a"));
        System.out.println("indexOf python: " + s.indexOf("python")); // -1，找不到
    }

    // 3. 转换
    static void convert() {
        System.out.println("\n===== 转换 =====");
        System.out.println("toUpperCase: " + "Hello".toUpperCase());  // HELLO
        System.out.println("toLowerCase: " + "Hello".toLowerCase());  // hello

        char[] chars = "abc".toCharArray();
        System.out.println("charAt(0) of chars: " + chars[0]);        // a
        String fromChars = new String(chars);
        System.out.println("new String(chars): " + fromChars);        // abc

        int num = Integer.parseInt("123");
        System.out.println("parseInt: " + (num + 1));                 // 124
        String numStr = String.valueOf(123);
        System.out.println("valueOf: " + numStr);                     // 123
    }

    // 4. 替换
    static void replace() {
        System.out.println("\n===== 替换 =====");
        String s = "I like cats, cats are cute";
        System.out.println("replace: " + s.replace("cats", "dogs"));         // 全部替换，参数是普通文本
        System.out.println("replaceFirst: " + s.replaceFirst("cats", "dogs")); // 只替换第一个

        // replaceAll 的参数是"正则表达式"，不是普通文本。
        // 正则是一种描述"字符规律"的小语法：
        //   .  表示任意一个字符
        //   c.ts 的意思就是：c + 任意一个字符 + ts，所以能匹配 "cats"、"cuts"、"c#ts" 等
        System.out.println("replaceAll(正则): " + s.replaceAll("c.ts", "pets"));
    }

    // 5. 拆分
    static void split() {
        System.out.println("\n===== 拆分 =====");
        String s = "apple,banana,orange";
        String[] fruits = s.split(","); // 这里的 "," 也会被当成正则表达式，但它本身没有特殊含义，按普通逗号拆分即可
        for (String f : fruits) {
            System.out.println("fruit: " + f);
        }

        String s2 = "a,b,,";
        System.out.println("split默认长度: " + s2.split(",").length);     // 2，末尾空串被去掉
        System.out.println("split(-1)长度: " + s2.split(",", -1).length); // 4，保留末尾空串

        // 正则的威力在于能一次匹配"多种写法"。\\s* 的意思是：
        //   \\s 表示一个空白字符（空格、tab等），* 表示"前面这个东西出现0次或多次"
        // 所以 ",\\s*" 能同时处理 "苹果,香蕉" 和 "苹果, 香蕉"（逗号后有没有空格都行）
        String s3 = "苹果, 香蕉,橙子";
        String[] fruits2 = s3.split(",\\s*");
        for (String f : fruits2) {
            System.out.println("正则拆分: " + f);
        }
    }

    // 6. 截取
    static void substring() {
        System.out.println("\n===== 截取 =====");
        String s = "Hello World";
        System.out.println("substring(6): " + s.substring(6));     // World
        System.out.println("substring(0,5): " + s.substring(0, 5)); // Hello，左闭右开
        System.out.println("charAt(0): " + s.charAt(0));            // H
    }

    // 7. 去空格
    static void trim() {
        System.out.println("\n===== 去空格 =====");
        String s = "   hello world   ";
        System.out.println("trim: [" + s.trim() + "]");   // [hello world]
        System.out.println("strip: [" + s.strip() + "]"); // [hello world]，效果类似trim

        String s2 = "  a   b  ";
        System.out.println("trim不处理中间空格: [" + s2.trim() + "]"); // [a   b]

        String s3 = "a b  c";
        System.out.println("replaceAll去掉所有空格: " + s3.replaceAll("\\s", "")); // abc
    }

    // 8. intern
    //
    // 先说"字符串常量池"是什么：
    // Java 为了省内存，专门开了一块区域叫"字符串常量池"，用来存字符串字面量（直接用双引号写出来的字符串）。
    // 内容相同的字面量，只会在常量池里存一份，大家共用，不会重复创建对象。
    //
    //   String a = "hello";
    //   String b = "hello";
    //   a == b  // true，因为 a、b 都是直接指向常量池里同一个 "hello"
    //
    // 但如果用 new String(...) 创建字符串，就是在堆内存里单独开一个新对象，
    // 不会自动放进常量池，哪怕内容和池子里的一样，也是两个不同的对象。
    //
    //   String c = new String("hello");
    //   a == c  // false，c 是堆里新建的对象，和常量池里的 "hello" 不是同一个
    //
    // intern() 的作用：把当前字符串拿去常量池里"认亲"——
    // 如果池子里已经有内容相同的字符串，就返回池子里那个的引用；
    // 如果没有，就把当前字符串放进池子，再返回这个引用。
    static void intern() {
        System.out.println("\n===== intern =====");

        String a = "hello"; // 字面量，直接进常量池
        String c = new String("hello");  // new 出来的，是堆里的新对象

        System.out.println("a == c: " + (a == c)); // false，c 和常量池里的 a 不是同一个对象

        String d = c.intern(); // 去常量池找 "hello"，找到了，返回池子里那个引用
        System.out.println("a == d: " + (a == d)); // true，d 现在和 a 指向同一个对象了
    }

    static void performance() {
        String string = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));

        StringBuffer stringBuffer = new StringBuffer("");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start));

        StringBuilder stringBuilder = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("stringBuilder: " + (end - start));
    }
}