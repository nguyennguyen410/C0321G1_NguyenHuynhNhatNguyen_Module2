package java_collection_framework.bai_tap.Map;

import java_collection_framework.thuc_hanh.hashmap_hashset.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();


        Integer value = 1;

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (map.isEmpty()) {
                map.put(string.charAt(i), value);
            } else if (map.containsKey(string.charAt(i))) {
                //Integer value1 = map.get(string.charAt(i));
                /*value = map.remove(string.charAt(i));*/
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);

            } else {
                map.put(string.charAt(i), value);
            }
        }

        for (Map.Entry<Character, Integer> mapPrint : map.entrySet()) {
            System.out.println("Char " + mapPrint.getKey() + " display " + mapPrint.getValue());
        }
    }
}
