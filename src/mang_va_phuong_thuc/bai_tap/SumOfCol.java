package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class SumOfCol {
    public static void main(String[] args) {
        int row,col;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row:");
        row = input.nextInt();
        System.out.print("Enter col:");
        col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print("Enter element "+i+ " "+j+" :");
                arr[i][j] = input.nextInt();
            }
        }
        int col1;
        System.out.println("Enter Col to calculate: ");
        col1 = input.nextInt();
        int value=0;
        for(int k = 0; k<row; k++){
            value = value+arr[k][col1];
        }
        System.out.println("Value: "+value);
    }
}
