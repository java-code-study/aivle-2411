package com.chap06.sub02;

public class MustTypeCastMain {
    public static void main(String[] args) {
        Person person = new Person("사람");
        Student student = new Student("학생", 101);

        person.introduce();
        student.introduce();
        student.showStudentId();

//        Student castedStudent = (Student) person;
//        castedStudent.showStudentId();

        Person p = student;
        p.introduce();
        ((Student)p).showStudentId();
    }
}
