public class Cls {

    double radius;

    public Cls(double radius){
        this.radius = radius; //초기화 코드
    }
    public Cls(int radius){
        this.radius = radius;
    }

    double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Cls aivle = new Cls(3.0);
        Cls ball = new Cls(1.0);
        Cls ball2 = new Cls(6);
        System.out.println("부피 : " + aivle.getVolume());
        System.out.println("표면적 : " + aivle.getArea());
        System.out.println("부피 : " + ball.getVolume());
        System.out.println("표면적 : " + ball.getArea());
    }

}
