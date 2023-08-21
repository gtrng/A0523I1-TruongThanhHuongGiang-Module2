package ss6_Inheritance.Circle;

import ss6_Inheritance.Circle.Circle;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(3, "red");
        System.out.println(c.area());
        System.out.println(c.toString());
        Cylinder m = new Cylinder(4, "blue", 3);
        System.out.println(m.volume());
        System.out.println(m.toString());
    }
}
