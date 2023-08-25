package ss7_AbstractClass_Interface.Shape;

import ss7_AbstractClass_Interface.Shape.iResizeable;

public class Square implements iResizeable {
    private double side;

    public Square(){
    }
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getArea(){
        return (side * side);
    }

    public double getPerimeter(){
        return (side * 2);
    }

    @Override
    public void resize(double percent) {
        side *= percent/100.0;
    }
}
