package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        int n;
        int count = 0;
        int n1 = 2;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong SNT can in ra: ");
        n = input.nextInt();
        while (count < n) {
            for (int i = 2; i <= Math.sqrt(n1); i++) {
                if (n1 % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                System.out.println(n1);
                n1++;
                count++;
            } else {
                n1++;
            }
        }

    }
}
