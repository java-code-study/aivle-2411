public class UnaryOperatorExample {
    public static void main(String[] args) {
        int number = 5;
        int result = 0;

        result = ++number;
        System.out.println(result);
        System.out.println(number);

//        System.out.println(number);
//        System.out.println(number++); //처리는 5로, 최종적으로는 6을 저장
//        System.out.println(++number); //최종적으로 7을 저장, 처리는 7로.
//        System.out.println(number);
    }
}
