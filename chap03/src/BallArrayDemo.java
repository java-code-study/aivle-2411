class Ball {
    String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}
public class BallArrayDemo {
    public static void main(String[] args) {
        Ball[] balls = new Ball[5];

        for (int i = 0; i < 2; i++){
            balls[i] = new Ball();
            balls[i].setName((i+1) + "번 공");
        }

        System.out.println("배열 원소 조회");
        for (Ball ball : balls) {
            if(ball != null) {
                System.out.println(ball.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
