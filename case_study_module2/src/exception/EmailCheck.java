package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public boolean checkName(String email) throws EmailException {
        final String EMAIL_REGEX = "^[a-z][a-zA-Z0-9\\.\\_]+\\@[a-z0-9A-Z]+(\\.[a-z]{2,})+$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        boolean check = matcher.matches();
        if (!check){
            throw new EmailException("Email is not valid");
        }
        return check;
    }
}
