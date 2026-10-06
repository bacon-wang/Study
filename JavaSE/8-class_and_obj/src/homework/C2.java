package homework;


class A {

}

class B extends A {

}

class C extends B {

}


public class C2 {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
    }
}
