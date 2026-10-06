package example;

public class Programmer extends Employee {
    public Programmer(String name, int age, String employeeId) {
        super(name, age, employeeId); // 调用父类构造
    }

    // 重写父类的 work 方法
    @Override
    public void work() {
        System.out.println(getName() + " 正在写代码...");
    }

    // Programmer 特有的方法
    public void debug() {
        System.out.println(getName() + " 正在调试bug...");
    }
}

//class Test extends Programmer {} // Cannot inherit from final class 'example.Programmer'
