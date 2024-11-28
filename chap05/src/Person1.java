public class Person1 {
    private String name;
    private int age;

    private Person1() {}

    public Person1 setName(String name) {
        this.name = name;
        return this;
    }

    public Person1 setAge(int age) {
        this.age = age;
        return this;
    }

    public void hello() {
        System.out.println("안녕 나는 " + name + "이고, " + age + "살이야.");
    }

    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setName("민규").setAge(21).hello();

    }
}
