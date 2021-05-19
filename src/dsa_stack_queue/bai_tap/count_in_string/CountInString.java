package dsa_stack_queue.bai_tap.count_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = input.nextLine();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        /*String[] arrayString = string.split("[ .,!?]");*/
        String[] arrayString = string.split("\\s+");

        /*for (String i: arrayString){
            System.out.println(i);
        }*/
        /*for (int j = 0; j < arrayString.length; j++) {
            if (arrayString[j].equals(" ")) {
                arrayString[j] = null;
            }
        }*/
        map.put(arrayString[0], 1);
        for (int i = 1; i < arrayString.length; i++) {
            /*if (arrayString[i] == null) {
                continue;
            } else*/
            if (map.containsKey(arrayString[i])) {
                int value = map.get(arrayString[i]) + 1;
                map.put(arrayString[i], value);
            } else {
                map.put(arrayString[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry:map.entrySet()){
             System.out.println(entry.getKey()+ " " +entry.getValue());
        }

    }
}
