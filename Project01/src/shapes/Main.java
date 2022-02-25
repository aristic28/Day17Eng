package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,4);
        System.out.println("volume: "+rectangle.volume());
        System.out.println("surface: "+rectangle.surface());
    }
}
