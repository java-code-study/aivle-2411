public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1, j = 1;

        while(i < 1) {
            System.out.println("While 루프 " + i + "번째 반복 실행중입니다.");
            i++;
        }
        System.out.println("While 루프 종료 후 변수 i의 값은 " + i + "입니다.");

        do {
            System.out.println("While 루프 " + j + "번째 반복 실행중입니다.");
            j++;
        } while (j < 1);
        System.out.println("While 루프 종료 후 변수 i의 값은 " + j + "입니다.");
    }
}
