package example;

public class StaticTest {
    static {
        System.out.println("静态代码块执行了");
    }

    {
        System.out.println("实例代码块执行了");
    }

    StaticTest() {
        System.out.println("构造函数执行了");
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest(); // 第一次加载类，会执行静态代码块
        System.out.println("=============");
        StaticTest st2 = new StaticTest(); // 已加载类，不会执行静态代码块
    }

}
