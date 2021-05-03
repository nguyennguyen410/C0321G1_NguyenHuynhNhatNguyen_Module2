package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class DisplayImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter width: ");
                    int width = input.nextInt();
                    System.out.println("Enter height: ");
                    int height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("Enter height: ");
                    int height2 = input.nextInt();
                    for (int i = 0; i < height2; i++) {
                        for (int j = 0; j < height2; j++) {
                            if (j <= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("\n");
                    }
                    for (int i = height2; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Enter height: ");
                    int height3 = input.nextInt();
                    for (int i = 0; i < height3; i++) {
                        for (int j = 0; j < height3 * 2 - 1; j++) {
                            if (j >= (height3 - 1) - i && j <= (height3 - 1) + i) {
                                System.out.print('*');
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
