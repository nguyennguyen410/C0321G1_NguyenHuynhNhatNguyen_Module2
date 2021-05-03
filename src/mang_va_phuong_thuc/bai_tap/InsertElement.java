package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class InsertElement {
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
        int input1;
        System.out.print("Enter Element:");
        input1 = input.nextInt();
        int index;
        System.out.print("Enter index:");
        index = input.nextInt();
        while (index <= 1 || index > arr.length - 1) {
            System.out.print("Wrong index:");
            index = input.nextInt();
        }
        int[] newArr = new int[size + 1];
        for (int k = 0; k < newArr.length; k++) {
            if (k == index) {
                newArr[index] = input1;
                break;
            } else {
                newArr[k] = arr[k];
            }
        }
        for (int l = index + 1; l < newArr.length; l++) {
            newArr[l] = arr[l - 1];
        }

        System.out.print("arr: ");
        for (int m = 0; m < newArr.length; m++) {
            System.out.print(newArr[m] + "\t");
        }
    }
}
