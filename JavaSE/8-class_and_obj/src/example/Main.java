package example;

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

    public static void main(String[] args) {
        Flyable[] flyable = {new Duck(), new Plane(), new Chinese()};
        for (Flyable f : flyable) {
            f.fly();
        }
    }

}
