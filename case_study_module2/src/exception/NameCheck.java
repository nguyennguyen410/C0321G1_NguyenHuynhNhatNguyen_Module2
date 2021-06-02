package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCheck {
    public boolean checkName(String name) throws NameException {
        final String NAME_CUSTOMER_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        Pattern pattern = Pattern.compile(NAME_CUSTOMER_REGEX);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        if (!check){
            throw new NameException("Name Customer is not valid");
        }
        return check;
    }
}
