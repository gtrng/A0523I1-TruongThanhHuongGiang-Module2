package ss6_Inheritance.Circle;


public class Cylinder extends Circle {
    public double height;

    public Cylinder(){
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    public double volume() {
        return super.area() * height;
    }
}
