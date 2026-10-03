public class Main {
    public static void main1(String[] args) {
        // 创建第一个 Person 对象
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 25;
        p1.sayHello();  // 输出：大家好，我叫张三，今年25岁。

        // 创建第二个 Person 对象
        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 30;
        p2.sayHello();  // 输出：大家好，我叫李四，今年30岁。
    }

    public static void main2(String[] args) {
        Phone phone = new Phone();  // 输出：创建了一个手机对象
        phone.brand = "Apple";
        phone.model = "iPhone 15";
        phone.price = 5999.0;
        phone.showInfo();  // 输出：品牌：Apple，型号：iPhone 15，价格：5999.0
    }

    public static void main3(String[] args) {
        // 使用无参构造方法
        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S24";
        phone1.price = 6999.0;

        // 使用有参构造方法（更简洁）
        Phone phone2 = new Phone("Xiaomi", "14 Pro", 4999.0);

        phone1.showInfo();
        phone2.showInfo();
    }

    public static void main(String[] args) {
        Person p = new Person("bei", 22);
        System.out.println(p); // 重写
    }
}

