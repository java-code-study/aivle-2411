import java.util.Arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] scores = {
                {100, 90, 50, 95, 10},
                {84, 29, 30, 22, 11},
                {20, 12, 49, 5, 8}
        };
        int firstRowFirstCol = scores[0][0];
        System.out.println(firstRowFirstCol);

        int secondRowThirdCol = scores[1][2];
        System.out.println(secondRowThirdCol);

        System.out.println("배열의 크기 : " + scores.length);
        System.out.println("첫번째행의 크기 : " + scores[0].length);
        System.out.println("전체 원소의 수 : " + (scores.length * scores[0].length));

        for(int i = 0; i < scores.length; i++ ){
            for(int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        int[] temp = scores[0];

        System.out.println(Arrays.toString(temp));

    }
}
