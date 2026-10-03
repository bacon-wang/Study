public class Person {
    // 构造
    Person() {
//        System.out.println();  // this() 前有代码则报错
        this("bei", 18); // this() 调用其他构造来简化代码（必须在第一行）
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员变量
    String name;
    int age;

    // 成员方法
    public void sayHello() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁。");
    }

    // 所有类都是从 Object 继承而来
    // println 调用的是 Object.toString
    // 任何类都可以重写 toString，运行时动态绑定到自己重写的 toString
//    public String toString() {
////        return getClass().getName() + "@" + Integer.toHexString(hashCode()); // 源码输出：Person@5acf9800
//        return "name: " + this.name + " | " + "age: " + this.age; // name: bei | age: 22
//    }

    // 可以生成 toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
