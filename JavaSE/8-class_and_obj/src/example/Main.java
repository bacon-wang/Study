package example;

public class Main {
    public static void main1(String[] args) {
        Programmer p = new Programmer("bei", 23, "0024");
        Designer d = new Designer("bacon", 24, "0025");

        p.work();
        d.work();
    }

    public static void main(String[] args) {
        final int a = 10;
        a = 20; // Cannot assign a value to final variable 'a'
    }
}
