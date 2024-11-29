package com.chap06.sub02;

public class TypeCheckMain {
    public static void main(String[] args) {
        Person person = new Person("김철수");
        Student student = new Student("이영희", 123456);

        if(person instanceof Person) {
            System.out.println("person은 Person 클래스의 인스턴스임.");
        }

        if(student instanceof Person) {
            System.out.println("학생! 너 사람이구나..");
        }

        if(person instanceof Student) {
            Student castedStudent = (Student) person;
            castedStudent.showStudentId();
        } else {
            System.out.println("사람은 학생이 되지 못했다..");
        }

        Person p = student;
        p.introduce();

        if(p instanceof Student) {
            Student s = (Student) p;
            s.introduce(); //<- 자식것이 없으면 부모꺼를 실행..!
        }
    }
}
