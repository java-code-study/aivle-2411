public class StringMethodDemo {
    public static void main(String[] args) {
        String originalString = " Java Programming ";

        String subString = originalString.substring(5);
        System.out.println(subString);

        String lowerCaseString = originalString.toLowerCase();
        System.out.println(lowerCaseString);

        String upperCaseString = originalString.toUpperCase();
        System.out.println(upperCaseString);

        String trimmedString = originalString.trim();
        System.out.println(trimmedString);
    }
}
