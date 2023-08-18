package ss5_AM_Static.Circle;

import static java.lang.Math.PI;

class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    double getArea(){
        return PI * radius *radius;
    }
}
