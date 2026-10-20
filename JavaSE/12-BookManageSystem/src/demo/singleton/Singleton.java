package demo.singleton;

public class Singleton {
//    // 饿汉式：程序启动就创建
//    private static Singleton instance = new Singleton(); // 静态实例，全局就一份
//
//    private Singleton() {} // 不允许外部创建实例
//
//    static public Singleton getInstance() { // 提供全局访问点
//        return instance;
//    }

    // 懒汉式：第一次访问才创建
    private static Singleton instance; // 静态实例，全局就一份

    private Singleton() {} // 不允许外部创建实例

    static public synchronized Singleton getInstance() { // 提供全局访问点
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
