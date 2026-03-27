package AbstractC_Interface;

// STATIC METHOD - BELONG TO ONLY INTERFACE INTSELF ------
interface MO {
    double compute(double a, double b);

    static double square (double x) {
        return x * x;
    } 

    static boolean isPositive(double x) {
        return x > 0;
    }
}

class Adder implements MO {
    @Override
    public double compute (double a, double b) {
        return a + b;
    }
}

public class static1 {
    public static void main(String[] main) {
        System.out.println(MO.square(5));
        System.out.println(MO.isPositive(2));

        MO m = new Adder();
        System.out.println(m.compute(3, 4));
    }
}
