package shapes;

public class Square extends Rectangle{

    public Square(double a){
        super(a,a);
    }

    public String toString(){
        return "Square: "+getA();
    }
}
