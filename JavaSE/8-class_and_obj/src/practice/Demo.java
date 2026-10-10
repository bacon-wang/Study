package practice;

interface Greeting {
    void hello(String name);
}

public class Demo {
    public static void main(String[] args) {
        // ① 补全：用匿名内部类实现 Greeting 接口（关键词只有一个：new）
        new Greeting() {
            @Override
            public void hello(String name) {
                System.out.println("hello " + name);
            }
        }.hello("beibei");

    }
}
