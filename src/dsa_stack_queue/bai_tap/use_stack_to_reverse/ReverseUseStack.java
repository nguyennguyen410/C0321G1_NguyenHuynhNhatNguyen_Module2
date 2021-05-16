package dsa_stack_queue.bai_tap.use_stack_to_reverse;

import java.util.Stack;
import java.util.Scanner;

public class ReverseUseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            stack.push(array[i]);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = stack.pop();
        }
        System.out.println("Mang sau khi reverse bang stack la: ");
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
