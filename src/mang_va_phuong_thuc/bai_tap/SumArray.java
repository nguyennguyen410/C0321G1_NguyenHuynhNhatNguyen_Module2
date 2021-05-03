package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class SumArray {
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
        int size1;
        int[] arr1;
        System.out.print("Enter a size 1:");
        size1 = input.nextInt();
        while (size1 < 0) {
            System.out.print("Enter a size1:");
            size1 = input.nextInt();
        }
        arr1 = new int[size1];
        int k = 0;
        while (k < arr1.length) {
            System.out.print("Enter element" + (k + 1) + " : ");
            arr1[k] = input.nextInt();
            k++;
        }
        System.out.print("arr: ");
        for (int l = 0; l < arr1.length; l++) {
            System.out.print(arr1[l] + "\t"+"\n");
        }
        int[] newArr = new int[size+size1];
        for (int m = 0; m<arr.length; m++){
            newArr[m] = arr[m];
        }
        for (int n = 0; n<arr1.length; n++){
            newArr[n+arr.length] = arr1[n];
        }
        for (int o = 0; o < newArr.length; o++) {
            System.out.print(newArr[o] + "\t");
        }
    }
}
