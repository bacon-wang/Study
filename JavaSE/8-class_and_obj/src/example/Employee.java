package example;

public class Employee {
    private String name;
    private int age;
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmployeeId() { return employeeId; }

    public void work() {
        System.out.println(name + " 正在工作...");
    }
}
