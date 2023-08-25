package ss7_AbstractClass_Interface.Shape;

import ss7_AbstractClass_Interface.Shape.iResizeable;

public class Rectangle implements iResizeable {
    private double length, width;
    public Rectangle()
    {
        length = 1;
        width = 1;
    }
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getArea()
    {
        return (length * width);
    }
    public double getPerimeter()
    {
        return (2 * (length + width));
    }

    @Override
    public void resize(double percent) {
        width *= percent/100.0;
        length *= percent/100.0;
    }
}
