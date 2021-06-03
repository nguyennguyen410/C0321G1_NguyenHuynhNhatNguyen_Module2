package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileCheck {
    public boolean checkMobile(String mobile) throws MobileException {
        final String MOBILE_REGEX = "^\\([0-9]{2}\\)-[0-9]{10}$";
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(mobile);
        boolean check = matcher.matches();
        if (!check){
            throw new MobileException("Mobile is not valid ((XX)-XXXXXXXXXX)");
        }
        return check;
    }
}
