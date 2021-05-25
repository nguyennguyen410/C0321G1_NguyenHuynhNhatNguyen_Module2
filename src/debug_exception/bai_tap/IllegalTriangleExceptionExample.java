package debug_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionExample {

    public static void main(String[] args) {
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhap canh thu 1: ");
                side1 = Double.parseDouble(input.nextLine());
                System.out.println("Nhap canh thu 2: ");
                side2 = Double.parseDouble(input.nextLine());
                System.out.println("Nhap canh thu 3: ");
                side3 = Double.parseDouble(input.nextLine());
                Triangle triangle = new Triangle(side1, side2, side3);
            } catch (NumberFormatException e) {
                System.err.println("Cac canh phai la so " + e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }


}
