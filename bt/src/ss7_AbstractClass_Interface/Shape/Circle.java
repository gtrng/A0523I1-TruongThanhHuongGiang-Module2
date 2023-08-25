package ss7_AbstractClass_Interface.Shape;

import static java.lang.Math.PI;

public class Circle implements iResizeable {
    public double radius;
    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public double area(){
        return PI * radius *radius;
    }

    @Override
    public void resize(double percent) {
        radius *= percent/100.0;
    }
}
