public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Jane Doe");
        System.out.println("이름 : " + person.getName());
        person.setName("John Doe");
        System.out.println("변경된 이름 : "+ person.getName());
    }
}
