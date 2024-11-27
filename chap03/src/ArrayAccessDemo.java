public class ArrayAccessDemo {
    public static void main(String[] args) {
        int[] scores = {100, 90, 50, 95, 85};

        int firstScore = scores[0];
        System.out.println("firstScore : " + firstScore);

        int lastScore = scores[scores.length - 1];
        System.out.println("lastScore : " + lastScore);
        System.out.println("scores.length : " + scores.length);

        //for(초기화구문;반복의기준;증감값)
        for(int i = 0; i < scores.length ; i++) {
            System.out.println("원소" + i + " : " + scores[i]);
        }

        //for(단일객체선언 : 배열)
        for(int score : scores) {
            System.out.println(score);
        }


    }
}
