package abstract_class_interface.bai_tap.interface_resizeable;

import java.util.Random;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Random generator = new Random();
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.3);
        circles[2] = new Circle(4.4, "Blue", false);
        System.out.println("Array circles: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        circles[0].reSize(generator.nextDouble() * 100);
        circles[1].reSize(generator.nextDouble() * 100);
        circles[2].reSize(generator.nextDouble() * 100);
        System.out.println("Array circles resize: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(1.1,2.2);
        rectangles[2] = new Rectangle(3.3, 4.4, "Blue", false);
        System.out.println("Array rectangles: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        rectangles[0].reSize(generator.nextDouble() * 100);
        rectangles[1].reSize(generator.nextDouble() * 100);
        rectangles[2].reSize(generator.nextDouble() * 100);
        System.out.println("Array retangles resize: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Square[] squares = new Square[2];
        squares[0] = new Square();
        squares[1] = new Square(3.3, "Blue", false);
        System.out.println("Array squares: ");
        for (Square square : squares) {
            System.out.println(square);
        }

        squares[0].reSize(generator.nextDouble() * 100);
        squares[1].reSize(generator.nextDouble() * 100);

        System.out.println("Array squares resize: ");
        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
