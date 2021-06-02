package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TypeCustomerCheck {
    public boolean checkTypeCustomer(String typeCustomer) throws TypeCustomerException {
        final String TYPE_CUSTOMER_REGEX = "^(silver||gold||platinum||diamond)$";
        Pattern pattern = Pattern.compile(TYPE_CUSTOMER_REGEX);
        Matcher matcher = pattern.matcher(typeCustomer);
        boolean check = matcher.matches();
        if (!check){
            throw new TypeCustomerException("Type customer is silver, gold, platinum or diamond");
        }
        return check;
    }
}
