package example;

public class Car {
    private String brand = "Tesla";
    private boolean engineRunning = false;
    private int testNum = 1;

    class Engine {
        private int testNum = 10;

        void start() {
            engineRunning = true;
            System.out.println(brand + "'s engine started");
        }

        void stop() {
            engineRunning = false;
            System.out.println(brand + "'s engine stopped");
        }

        void test() {
            System.out.println(testNum); // 本方法在 Engine 内，所以打印的是 engine 的字段
            System.out.println(Car.this.testNum); // 可以通过 类名.this 来显式用外部类的 this
        }
    }

    static class Test {
         void test() {
             System.out.println("Test 的 test 方法执行了");
         }
    }

    void checkStatus() {
        System.out.println("engine running: " + engineRunning);
    }

    void test() {
        System.out.println(testNum);

        // 外部类访问内部类：必须先创建内部类实例（内部类成员依附于具体对象）
        Engine engine = new Engine(); // 在外部类实例方法中，等价于 this.new Engine()
        System.out.println(engine.testNum); // 外部类可以直接访问内部类的 private 成员
    }

    void test2() {
        class Test2 {
            void func() {
                System.out.println("局部内部类的 func 调用了");
            }
        }

        new Test2().func();
    }
}
