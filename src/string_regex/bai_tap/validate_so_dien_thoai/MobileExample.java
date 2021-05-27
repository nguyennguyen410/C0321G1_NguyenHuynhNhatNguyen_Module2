package string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExample {
    private static final String MOBILE_REGEX = "^[0-9][0-9]\\-[0-9]{10}$";

    public MobileExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
