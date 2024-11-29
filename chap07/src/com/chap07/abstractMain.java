package com.chap07;

public class abstractMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.draw();

        Shape shape = new Circle(15);
        shape.draw(); // <- Circle에 있는 draw() 함수를 호출 한다.
    }
}
