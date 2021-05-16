package dsa_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class NumberToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input num: ");
        int num = input.nextInt();
        while (num / 2 != 0) {
            stack.push((num % 2));
            num = num / 2;
        }
        stack.push(1);
        while (stack.size()>=0){
            System.out.println(stack.pop());
        }
    }
}
