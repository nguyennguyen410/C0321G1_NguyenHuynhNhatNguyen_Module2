package thuat_toan_sap_xep.bai_tap.minh_hoa_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nsắp xếp:");
        insertionSort(list);
        System.out.println("Mang sau khi sap xep xong la: " + Arrays.toString(list));

    }

    public static void insertionSort(int[] array) {
        int pos, temp;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            temp = array[i];
            System.out.println("temp : " + temp);
            pos = i;
            System.out.println("Index : " + pos);
            while (pos > 0 && temp < array[pos - 1]) {
                System.out.println("So sánh tại vị trí " + (pos - 1) + " va temp: " + pos + " > 0 và" + temp + " < " + array[pos - 1]);
                System.out.println("Tiến hành dịch chỗ cho " + array[pos - 1] + " vào vị trí thứ " + pos);
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            System.out.println("Chèn " + temp + " vào vị trí " + pos);
            array[pos] = temp;
            System.out.println("Mang sau khi sort lần thứ " + i + ": " + Arrays.toString(array));
        }

    }
}
