package dsa_stack_queue.bai_tap.kiem_tra_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = input.nextLine();
        boolean status = true;

        Stack stack = new Stack();
        Queue queue = new LinkedList();
        for (int i = 0; i<string.length(); i++){
            stack.push(string.charAt(i));
            queue.offer(string.charAt(i));
        }

        for (int j = 0; j<string.length()/2; j++ ){
            if(stack.pop()==queue.poll()){
                status = true;
            }else {
                status = false;
            }
        }

        checkStatus(status);
    }

    public static void checkStatus(boolean status) {
        if (status){
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}
