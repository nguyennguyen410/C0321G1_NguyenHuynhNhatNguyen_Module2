package dsa_stack_queue.bai_tap.kiem_tra_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucChuaNgoac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String string = input.nextLine();
        boolean status = false;
        Stack<Character> stackLeft = new Stack<Character>();
        Stack<Character> stackRight = new Stack<Character>();
        for (int i = 0; i<string.length(); i++ ){
            if (string.charAt(i)=='('){
                stackLeft.push(string.charAt(i));
            } else if(string.charAt(i)==')'){
                stackRight.push(string.charAt(i));
            }else {
                continue;
            }
        }
        while (!stackLeft.isEmpty() || !stackRight.isEmpty()){
            if(stackLeft.peek()=='(' && stackRight.peek()==')'){
                status = true;
                stackLeft.pop();
                stackRight.pop();
            }else {
                status = false;
                break;
            }
        }
        System.out.println(status);
    }
}
