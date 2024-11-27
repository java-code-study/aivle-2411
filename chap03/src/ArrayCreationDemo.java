public class ArrayCreationDemo {
    public static void main(String[] args) {
        int[] scoreMethod1 = {100, 90, 50, 95, 85};
        int[] scoreMethod2 = new int[] {100, 90, 50, 94, 85};
        int[] scoreMethod3;
        scoreMethod3 = new int[]{100, 90, 50, 94, 85};

        for(int score : scoreMethod1) {
            System.out.print(score + " ");
        }
        System.out.println();
        for(int score : scoreMethod2) {
            System.out.print(score + " ");
        }
        System.out.println();
        for(int score : scoreMethod3) {
            System.out.print(score + " ");
        }
    }
}
