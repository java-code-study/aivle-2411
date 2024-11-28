class Calc {
    public static double res; //마지막에 계산했던 결과를 저장하고 있겠다!
    static final double PI = 3.14159;

    public double getRes() {
        return res;
    }

    public double area(double rad) {
        res = PI * rad * rad;
        return res;
    }

    public static double circ(double rad) {
        res = 2 * PI * rad;
        return res;
    }
}
public class CalcTest {
    public static void main(String[] args) {
        System.out.println(Calc.circ(10));
        System.out.println(Calc.res);

        Calc myCalc = new Calc();
        myCalc.area(10);
        Calc yourCalc = new Calc();
        yourCalc.area(20);

        System.out.println(myCalc.getRes());
        System.out.println(yourCalc.getRes());
    }
}
