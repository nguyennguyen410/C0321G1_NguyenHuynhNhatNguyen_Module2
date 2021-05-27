package string_regex.bai_tap.validate_so_dien_thoai;



import java.util.Scanner;

public class MobileExampleTest {
    public static void main(String args[]) {
        MobileExample mobileExample = new MobileExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input class: ");
        String nameClass = scanner.nextLine();
        System.out.println(mobileExample.validate(nameClass));
    }
}
