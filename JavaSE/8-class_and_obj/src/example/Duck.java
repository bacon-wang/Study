package example;

public class Duck implements Flyable, Swimmable, Walkable {
    @Override
    public void fly() {
        System.out.println("duck flying...");
    }

    @Override
    public void swim() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void move() {
        Swimmable.super.move();
    }
}
