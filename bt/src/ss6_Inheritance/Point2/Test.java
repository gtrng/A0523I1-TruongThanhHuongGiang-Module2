package ss6_Inheritance.Point2;

public class Test {
    public static void main(String[] args) {
        Point m = new Point(2, 3);
        MovablePoint n = new MovablePoint(2, 4, 5, 6);
        System.out.println(m.toString());
        System.out.println(n.toString());
    }
}
