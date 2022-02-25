package shapes;

public class Rectangle implements Volumeable {
    private final double a;
    private final double b;

    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double volume() {
        return 2*(a+b);
    }

    @Override
    public double surface() {
        return a*b;
    }
}
