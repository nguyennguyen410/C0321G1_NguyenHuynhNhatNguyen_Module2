package debug_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionExample {
    public static void main(String[] args) throws IllegalTriangleException {
        double side1;
        double side2;
        double side3;
        Scanner input = new Scanner(System.in);
        System.out.println("Input side1: ");
        side1 = input.nextDouble();
        System.out.println("Input side2: ");
        side2 = input.nextDouble();
        System.out.println("Input side3: ");
        side3 = input.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException();
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException();
        } else {
            System.out.println("Perimeter is:" + (side1 + side2 + side3));
        }
    }
}
