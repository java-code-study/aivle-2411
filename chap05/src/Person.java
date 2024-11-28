public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("Good Name")) {
            this.name = name;
        }
        else {
            System.out.println("그런이름 싫어요..");
        }
    }

}
