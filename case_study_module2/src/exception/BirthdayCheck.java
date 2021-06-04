package exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdayCheck {
    public boolean checkBirthday(String birthday) throws BirthdayException {
        final String BIRTHDAY_REGEX = "^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$";
        Pattern pattern = Pattern.compile(BIRTHDAY_REGEX);
        Matcher matcher = pattern.matcher(birthday);
        boolean check = matcher.matches();
        if (!check) {
            throw new BirthdayException("Birthday is not valid (dd/mm/yy)");
        } else {
            check = checkAge(birthday);
        }
        return check;
    }

    public Boolean checkAge(String birthday) throws BirthdayException {
        boolean check = false;
        String[] strings = birthday.split("/");
        if ((Integer.parseInt(strings[0]) <= 0) && (Integer.parseInt(strings[0]) > 31)) {
            throw new BirthdayException("Wrong day!");
        } else if ((Integer.parseInt(strings[1]) <= 0) && (Integer.parseInt(strings[0]) > 12)) {
            throw new BirthdayException("Wrong month!");
        } else if (Integer.parseInt(strings[2]) < 1900) {
            throw new BirthdayException("Wrong year!");
        } else {
            LocalDate localDate = LocalDate.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String currentTime = localDate.format(dateFormatter);
            String[] strings1 = currentTime.split("/");
            if (Integer.parseInt(strings1[0]) - Integer.parseInt(strings[2]) < 18) {
                throw new BirthdayException("Under 18 age!");
            } else {
                System.out.println("Birthday Invalid");
                check = true;
            }
        }
        return check;
    }
}
