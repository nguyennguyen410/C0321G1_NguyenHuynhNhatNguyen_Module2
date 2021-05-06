package lop_va_doi_tuong_trong_java.bai_tap;

import lop_va_doi_tuong_trong_java.thuc_hanh.Rectangle;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    double getRoot3() {
        return -this.b / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        System.out.print("Enter b:");
        double b = scanner.nextDouble();
        System.out.print("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double d = quadraticEquation.getDiscriminant();
        if (d < 0) {
            System.out.println("The equation has no roots.");
        } else if (d == 0) {
            System.out.println("x = " + quadraticEquation.getRoot3());
        } else {
            System.out.println("x1 = " + quadraticEquation.getRoot1() + " x2 = " + quadraticEquation.getRoot2());
        }
    }
}
