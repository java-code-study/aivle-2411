public class StringManipulationDemo {
    public static void main(String[] args) {
        String baseString = "Hello";
        String stringToConcat = " World";
        String searchString = "lo";

        String concatenatedString = baseString.concat(stringToConcat);
        System.out.println(concatenatedString);

        int index = concatenatedString.indexOf(searchString);
        System.out.println(index);

        boolean isEmpty = baseString.isEmpty();
        System.out.println(isEmpty);

        int length = concatenatedString.length();
        System.out.println(length);
    }
}
