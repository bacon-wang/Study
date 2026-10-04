package example;

public class Designer extends Employee {
    public Designer(String name, int age, String employeeId) {
        super(name, age, employeeId);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在设计UI...");
    }

    public void createPrototype() {
        System.out.println(getName() + " 正在做原型...");
    }
}
