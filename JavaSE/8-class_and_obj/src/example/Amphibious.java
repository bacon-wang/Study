package example;

public interface Amphibious extends Walkable, Swimmable {
    // 两个接口都有 move 的默认实现，有歧义，此处必须显式声明用哪个默认实现
    @Override
    default void move() {
        // 1. 显式调用其中一个
//        Walkable.super.move();
//        Swimmable.super.move();

        // 2. 自己实现
        System.out.println("Amphibious move");
    }
}
