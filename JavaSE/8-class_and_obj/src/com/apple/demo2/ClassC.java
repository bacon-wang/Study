package com.apple.demo2;

import com.apple.demo1.ClassA;

public class ClassC {
    public void test() {
        ClassA a = new ClassA();
        // System.out.println(a.privateVar);    // 错误！private 不能访问
        // System.out.println(a.defaultVar);    // 错误！不同包不能访问 default
        // System.out.println(a.protectedVar);  // 错误！不同包且非子类不能访问 protected
        System.out.println(a.publicVar);        // 正确！只有 public 可以访问
    }
}
