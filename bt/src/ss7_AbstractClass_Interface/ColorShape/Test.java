package ss7_AbstractClass_Interface.ColorShape;

public class Test {
    public static void main(String[] args) {
        ShapeObject[] squares = {new Square(4), new Square(5), new Square(6), new Square(7)};
        for (int i =0; i < squares.length; i++){
            System.out.println("Square " +(i + 1));
            System.out.println("Area :" + squares[i].getArea());
            System.out.println("Perimeter :" + squares[i].getPerimeter());
            System.out.println("How to color :" +((Square)squares[i]).howToColor());
        }

    }
}
