package string_regex.bai_tap.validate_ten_lop_hoc;

import string_regex.thuc_hanh.validate_account.AccountExample;

import java.util.Scanner;

public class ClassExampleTest {

    public static void main(String args[]) {
        ClassExample classExample = new ClassExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input class: ");
        String nameClass = scanner.nextLine();
        System.out.println(classExample.validate(nameClass));
    }
}
