package practice;

public class Computer {
    private static String os = "Linux";

    // ① 补修饰符：让 Config 成为静态内部类
    static class Config {
        String cpu;
        int ram;

        Config(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        void show() {
            // ② 补写法：访问外部类的静态字段 os
            System.out.println("系统 " + Computer.os + "，CPU " + cpu + "，内存 " + ram + "GB");
        }
    }

    public static void main(String[] args) {
        // ③ 补全：不需要 new Computer，直接创建 Config
        Computer.Config cfg = new Computer.Config("amd", 16);
        cfg.show();
    }
}