public class StringExample {
    public static void main(String[] args) {
        String greeting = "안녕하세요";
        System.out.println(greeting);

        String name = new String("Java 사용자");
        System.out.println(name);

        char[] charArray = {'j', 'a', 'v', 'a', ' ', '프', '로', '그', '래', '머'};
        String programmer = new String(charArray);
        System.out.println(programmer);

        String fullName = "Kim" + " " + "Young";
        System.out.println(fullName);

        StringBuilder sb = new StringBuilder();
        sb.append("문자열 ").append("생성 ").append("예제");

        String result = sb.toString();
        System.out.println(result);
    }
}
