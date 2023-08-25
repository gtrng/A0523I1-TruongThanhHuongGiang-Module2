package ss7_AbstractClass_Interface.ColorShape;

public class Square extends ShapeObject  implements iColorable {
    private double side;
    private String color;
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
                "Area" + getArea() +
                '}';
    }

    public double getArea(){
        return (side * side);
    }

    public double getPerimeter(){
        return (side * 2);
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
