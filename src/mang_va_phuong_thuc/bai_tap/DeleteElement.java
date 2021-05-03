package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = input.nextInt();
        while (size < 0) {
            System.out.print("Enter a size:");
            size = input.nextInt();
        }
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("Enter Element: ");
        int a = input.nextInt();
        int index = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == a) {
                index = k;
            }
        }
        System.out.println(index);
        for (int l = index; l < arr.length-1; l++) {
            arr[l] = arr[l + 1];
        }
        arr[arr.length - 1] = 0;
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + "\t");
        }
    }
}
