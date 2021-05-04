package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class CountCharInString {
    public static void main(String[] args) {
        String str;
        char a;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = input.nextLine();
        System.out.println("Enter char: ");
        a = input.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==a){
                count++;
            }
        }
        System.out.println(a+"display "+count);
    }
}
