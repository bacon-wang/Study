package com.apple.demo1;

public class ClassB {
    public void test() {
        ClassA a = new ClassA();
        // System.out.println(a.privateVar);    // 错误！private 不能访问
        System.out.println(a.defaultVar);       // 正确！同包可以访问 default
        System.out.println(a.protectedVar);     // 正确！同包可以访问 protected
        System.out.println(a.publicVar);        // 正确！public 都可以访问
    }
}