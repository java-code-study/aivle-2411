public class ScoreWithArray {
    public static void main(String[] args) {
        int[] scores = {100, 90, 50, 95, 85};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;
        System.out.println("평균 점수 : " + average + ", 총점 : " + sum);

    }
}
