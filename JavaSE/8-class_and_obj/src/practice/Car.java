package practice;

public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    // 内部类：发动机
    class Engine {
        private int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            // 内部类直接访问外部类的私有字段
            System.out.println(brand + " 发动机，功率 " + power + " 马力");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        // ① 补全这一个语句：创建一个 Engine 实例（类型是 Car.Engine）
        Car.Engine engine = myCar.new Engine(1000);

        engine.show();

        // ② 补两处：声明类型 + new 的写法（同上思路，换个变量名 anotherEngine）
        Car.Engine anotherEngine = myCar.new Engine(800);
        anotherEngine.show();
    }
}