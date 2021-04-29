package bai1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        Integer num = scanner.nextInt();
        System.out.println("So vua nhap la: " + num);
        String num1="";
        switch (num){
            case 1:
                num1 = "mot";
                break;
            case 2:
                num1 = "hai";
                break;
            case 3:
                num1 = "ba";
                break;
            case 4:
                num1 = "bon";
                break;
            case 5:
                num1 = "nam";
                break;
            case 6:
                num1 = "sau";
                break;
            case 7:
                num1 = "bay";
                break;
            case 8:
                num1 = "tam";
                break;
            case 9:
                num1 = "chin";
                break;
        }
        System.out.println(num1);
    }
}
