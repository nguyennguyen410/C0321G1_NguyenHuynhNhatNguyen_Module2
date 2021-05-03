package mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class FindMax2Array {
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
        int max = arr[0][0];
        int k=0,l=0;
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                    k = i;
                    l = j;
                }
            }
        }
        System.out.println("Max element: "+max+" at "+"arr "+k+" "+l);
    }
}
