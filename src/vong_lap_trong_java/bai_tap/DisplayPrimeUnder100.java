package vong_lap_trong_java.bai_tap;

public class DisplayPrimeUnder100 {
    public static void main(String[] args) {
        int i = 2, j;
        boolean check = true;
        while (i <= 100) {
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    }
}
