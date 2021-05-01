package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong $ can doi: ");
        Float money = scanner.nextFloat();
        final Integer rate = 23000;
        Float total = money * rate;
        System.out.printf("Thanh VND: " + total + " dong");
    }
}
