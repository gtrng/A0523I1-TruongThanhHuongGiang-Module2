package ss7_AbstractClass_Interface.Shape;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.toString());
        c.resize(10);
        System.out.println(c.toString());
        Rectangle r = new Rectangle(4,5);
        System.out.println(r.toString());
        r.resize(10);
        System.out.println(r.toString());
        Square s = new Square(5);
        System.out.println(s.toString());
        s.resize(10);
        System.out.println(s.toString());
    }
}
