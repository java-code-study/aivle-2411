class Ball{
    double radius;

    public Ball(double r){
        this.radius = r;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

}

public class Prim {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a 의 값 : " + a);
        System.out.println("b 의 값 : " + b);

        Ball myBall = new Ball(4.0);
        Ball yourBall = myBall;
        yourBall.setRadius(5.0);

        System.out.println("myBall " + myBall.radius);
        System.out.println("yourBall " + yourBall.radius);
    }

}
