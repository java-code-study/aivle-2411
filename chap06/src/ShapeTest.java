class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double getRadius() {
        return r;
    }

    double area() {
        return Math.PI * r * r;
    }
}
class Sphere extends Circle {
    public Sphere(double r) {
        super(r);
    }

    double vol() {
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    double surfArea() {
        return 4 * super.area();
    }

    void info(){
        System.out.println("반지름" + getRadius() + "부피 " + vol());
        System.out.println("반지름" + getRadius() + "표면적 " + surfArea());
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Sphere s = new Sphere(10.0);
        s.info();
    }
}
