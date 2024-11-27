import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        stringList.remove("Python");

        System.out.println(stringList.size());

        String elementAtIndex = stringList.get(1);
        System.out.println(elementAtIndex);

        for (String string: stringList){
            System.out.println(string);
        }




        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(1);

        intList.remove(1); //1번째 index의 값을 지워야겠네!
        intList.remove(Integer.valueOf(1)); //1이라는 값을 찾아서 지워야겠네!

    }
}
