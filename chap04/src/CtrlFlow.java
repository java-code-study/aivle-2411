public class CtrlFlow {
    public static void main(String[] args) {
        int n = 1, s = 0;

        while(true) {
            s += n;
            if (n == 100) {
                break;
            }
            n++;
        }
        System.out.println("1부터 100까지 합 : " + s);

        for (int i = 1; i<= 100; i++) {
            if(!(i%5 == 0 || i%7 == 0)) {
                continue;
            }
            System.out.println(i + "는 5 또는 7의 배수 입니다.");
        }
    }
}
