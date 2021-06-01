package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdCardCheck {
    public boolean checkIdCard(String idCard) throws IdCardException {
        final String IDCARD_REGEX = "^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$";
        Pattern pattern = Pattern.compile(IDCARD_REGEX);
        Matcher matcher = pattern.matcher(idCard);
        boolean check = matcher.matches();
        if (!check){
            throw new IdCardException("Idcard is not valid (XXX XXX XXX)");
        }
        return check;
    }
}
