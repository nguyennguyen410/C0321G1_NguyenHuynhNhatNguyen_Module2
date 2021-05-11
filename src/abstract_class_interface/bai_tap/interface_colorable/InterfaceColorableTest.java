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
    }
}
