package com.chap06.sub02;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("나는 " + name + "입니다");
    }
}
