package abstract_class_interface.bai_tap.interface_colorable;

public class InterfaceColorableTest {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square();
        squares[1] = new Square(3.3, "Blue", false);
        System.out.println("Array squares: ");
        for (Square square : squares) {
            System.out.println(square);
            square.howToColor();
        }
        Rectangle rectangle = new Rectangle(5.5,7.7);
        Rectangle[] rectangles = {squares[0],squares[1],rectangle};
        for (Rectangle rectangle1 : rectangles) {
            System.out.println(rectangle1);
            if(rectangle1 instanceof Square){
                ((Square)rectangle1).howToColor();
            }

        }
    }
}
