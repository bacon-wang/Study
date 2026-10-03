public class Phone {
    String brand;
    String model;
    double price;

    // 无参构造
    public Phone() {
        this("未知品牌", "未知型号", 0.0);  // 调用三参数构造方法
    }

    // 一个参数的构造
    public Phone(String brand) {
        this(brand, "未知型号", 0.0);
    }

    // 两个参数的构造
    public Phone(String brand, String model) {
        this(brand, model, 0.0);
    }

    // 三个参数的构造
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("品牌：" + brand + "，型号：" + model + "，价格：" + price);
    }
}