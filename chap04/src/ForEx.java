public class ForEx {
    public static void main(String[] args) {
        int i, sum = 0;

        for (i = 0; i < 5; i++){
            sum += i;
            System.out.println("for 루프 " + (i + 1) + "번째 반복 실행중입니다.");
        }

        System.out.println("for 루프 종료 후 반복 횟수: " + i);
        System.out.println("누적 합계 :" + sum);

        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println("확장 for 루프에서 처리하는 값: " + number);
        }

    }
}
