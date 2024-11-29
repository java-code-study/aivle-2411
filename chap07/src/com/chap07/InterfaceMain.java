package com.chap07;

public class InterfaceMain {
    public static void main(String[] args) {
        MyInterface myClass = new MyClass();
        myClass.sayHello();
        MyInterface2 c = new MyClass();
        c.sayHello("홍길동");
    }
}
