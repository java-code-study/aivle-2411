package com.chap06.sub02;

public class Student extends Person{
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    void introduce() {
        System.out.println("나는 " + name + "학생이고, 학번은 " + studentId + "입니다.");
    }

    void showStudentId() {
        System.out.println("학번 : " + studentId);
    }
}
