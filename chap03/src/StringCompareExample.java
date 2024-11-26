public class StringCompareExample {
    public static void main(String[] args) {
        String firstString  = "SUNGYEOL";
        String secondString = "SUNGYEOL";
        String thirdString  = "Sungyeol";

        //같은 문자열
        int comparisonResult = firstString.compareTo(secondString);
        System.out.println(comparisonResult);

        boolean equalsResult = firstString.equals(secondString);
        System.out.println(equalsResult);

        //다른 문자열
        comparisonResult = firstString.compareTo(thirdString);
        equalsResult = firstString.equals(thirdString);

        System.out.println(comparisonResult);
        System.out.println(equalsResult);
    }
}
