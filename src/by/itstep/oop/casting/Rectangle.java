package by.itstep.oop.casting;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Square case
     * @param a side
     */
    public Rectangle(double a) {
        this(a, a);
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }

    @Override
    public void calculateP() {
        setP(2 * (a + b));
    }

    @Override
    public void calculateS() {
        setS(a * b);
    }
}
