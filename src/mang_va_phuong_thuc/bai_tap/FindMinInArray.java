package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class FindMinInArray {
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
        int min = arr[0];
        for (int k = 1; k<arr.length; k++){
            if(arr[k]<min){
                min = arr[k];
            }
        }
        System.out.println("Min value: "+min);
    }
}
