package example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main1(String[] args) {
        Programmer p = new Programmer("bei", 23, "0024");
        Designer d = new Designer("bacon", 24, "0025");

        p.work();
        d.work();
    }

    public static void main2(String[] args) {
        final int a = 10;
//        a = 20; // Cannot assign a value to final variable 'a'
    }

    public static void func(Employee e) {
        e.work();
    }

    public static void main3(String[] args) {
        Payment p1 = new AlipayPayment(10);
        Payment p2 = new WeChatPayment(20);

        p1.pay();
        p2.pay();
    }

    public static Employee newProgrammer() {
        return new Programmer("kitty", 23, "0026");
    }

    // 向上转型：返回值
    public static Employee newDesigner() {
        return new Designer("loup", 23, "0027");
    }

    public static void main4(String[] args) {
        Programmer p = new Programmer("bei", 23, "0024");
        Designer d = new Designer("bacon", 24, "0025");
        Employee e;

        // 向上转型：直接赋值
        e = p;
        e.work();
        e = d;
        e.work();

        // 向上转型：传参
        func(p);
        func(d);

        Programmer p1 = (Programmer) newProgrammer(); // 向下转型：Employee => Programme

    }

    public static void main5(String[] args) {
        Employee ref = new Programmer("bei", 23, "0024");
//        ref.debug(); // Cannot resolve method 'debug' in 'Employee'
    }

    public static void main6(String[] args) {
        Employee ref1 = new Programmer("bei", 23, "0024");

        ref1 = new Designer("bacon", 24, "0025");

        if (ref1 instanceof Programmer) {
            Programmer ref2 = (Programmer) ref1;
        } else if (ref1 instanceof Designer) {
            Designer ref2 = (Designer) ref1;
        } else {
            System.out.println("未知类型！");
        }
    }

    public static void pay(Payment p) { p.pay(); }

    public static WeChatPayment wechatPayment(double amount) { return new WeChatPayment(amount); }

    public static void main7(String[] args) {
        Payment p1 = new WeChatPayment(10); // 直接赋值
        p1.pay();

        Payment p2 = new AlipayPayment(20);
        pay(p2); // 函数传参

        Payment p3 = new BankCardPayment(30, "4222909281392948"); // 函数返回值
        p3.pay();

//        p2.returnMoney(); // Cannot resolve method 'returnMoney' in 'Payment'
        AlipayPayment p4 = (AlipayPayment) p2;
        p4.returnMoney();
    }

    public static void main8(String[] args) {
        Payment p1 = new AlipayPayment(10);

        // 预期外的操作
        p1 = new WeChatPayment(20);

        // 以为 p1 引用的还是支付 10 元的支付宝支付
        AlipayPayment p2 = null;
        if (p1 instanceof AlipayPayment) {
            p2 = (AlipayPayment) p1;
            p2.returnMoney();
        } else {
            System.out.println("其他支付方式暂无返现");
        }
    }

    public static void main9(String[] args) {
        Flyable[] flyable = {new Duck(), new Plane(), new Chinese()};
        for (Flyable f : flyable) {
            f.fly();
        }
    }

    public static void compare1(Student s1, Student s2) {
        int ret = s1.compareTo(s2);
        if (ret > 0) {
            System.out.println(s1.name + " 成绩更高");
        } else if (ret == 0) {
            System.out.println("成绩相同");
        } else {
            System.out.println(s2.name + " 成绩更高");
        }
    }

    public static void main10(String[] args) {
        Student s1 = new Student("zhangsan", 18, 40.3);
        Student s2 = new Student("lisi", 20, 80.4);

//        if (s1 > s2) // 编译器：你要比啥？？引用之间可不允许比较
        // 实现了 Comparable<Student>，告诉编译器怎么比，就可以比较了
        compare1(s1, s2);

        s1.score = 80.4;
        compare1(s1, s2);

        s1.score = s2.score + 10;
        compare1(s1, s2);

    }

    public static void compareScore(Student s1, Student s2) {
        ScoreComparator scoreComparator = new ScoreComparator();
        int ret = scoreComparator.compare(s1, s2);
        if (ret > 0) {
            System.out.println(s1.name + " 成绩更高");
        } else if (ret == 0) {
            System.out.println("成绩相同");
        } else {
            System.out.println(s2.name + " 成绩更高");
        }
    }

    public static void compareAge(Student s1, Student s2) {
        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(s1, s2);
        if (ret > 0) {
            System.out.println(s1.name + " 年龄更大");
        } else if (ret == 0) {
            System.out.println("年龄相同");
        } else {
            System.out.println(s2.name + " 年龄更大");
        }
    }

    public static void compareName(Student s1, Student s2) {
        NameComparator nameComparator = new NameComparator();
        int ret = nameComparator.compare(s1, s2);
        if (ret > 0) {
            System.out.println(s1.name + " 名字更大");
        } else if (ret == 0) {
            System.out.println("名字相同");
        } else {
            System.out.println(s2.name + " 名字更大");
        }
    }

    public static void main11(String[] args) {
        Student s1 = new Student("zhangsan", 18, 40.3);
        Student s2 = new Student("lisi", 20, 80.4);

        compareScore(s1, s2);
        s1.score = s2.score;
        compareScore(s1, s2);
        s1.score = s2.score + 10;
        compareScore(s1, s2);

        compareAge(s1, s2);
        s1.age = s2.age;
        compareAge(s1, s2);
        s1.age = s2.age + 10;
        compareAge(s1, s2);

        compareName(s1, s2);
        s1.name = s2.name;
        compareName(s1, s2);
        s1.name = s2.name + "1";
        compareName(s1, s2);
    }

    public static void bubbleSort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length - 1; i++) {
            for (int j = 0; j < comparable.length -1 - i; j++) {
                if (comparable[j].compareTo(comparable[j + 1]) > 0) {
                    Comparable temp = comparable[j];
                    comparable[j] = comparable[j + 1];
                    comparable[j + 1] = temp;
                }
            }
        }
    }

    public static void main12(String[] args) {
        Student s1 = new Student("zhangsan", 18, 99.3);
        Student s2 = new Student("l isi", 20, 82.4);
        Student s3 = new Student("wangwu", 8, 73.9);
        Student s4 = new Student("zhaoliu", 53, 41.5);

        Student[] students = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        // 默认用 comparable 接口的 compareTo 方法
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
//
//        Arrays.sort(students, new AgeComparator());
//        System.out.println(Arrays.toString(students));

        bubbleSort(students);
        System.out.println(Arrays.toString(students));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // clone 示例
        String[] strings1 = new String[] { new String("abc"), new String("edf")};
        String[] strings2 = strings1.clone();
        System.out.println(strings1);
        System.out.println(strings2);

        // 自定义类型 clone 示例
        Student s1 = new Student("zhangsan", 18, 99.3);
        Student s2 = (Student) s1.clone();

        System.out.println(s1.project.name);
        System.out.println(s2.project.name);
        System.out.println("===============");
        s1.project.name = "changed";
        System.out.println(s1.project.name);
        System.out.println(s2.project.name);
     }
}
