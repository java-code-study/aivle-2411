package com.chap07;

public class MyClass implements MyInterface, MyInterface2{

    public void sayHi() {
        System.out.println("Hi!");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요, 최대값은: " + MAX);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("안녕하세요, 제이름은: " + name);
    }
}
