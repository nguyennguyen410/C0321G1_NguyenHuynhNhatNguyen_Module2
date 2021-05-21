package thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxStringIncre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            if ((list.size() > 1 && string.charAt(i) <= list.getLast()) || list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
