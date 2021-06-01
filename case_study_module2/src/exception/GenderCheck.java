package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderCheck {
    public boolean checkGender(String sex) throws GenderException {
        final String SEX_REGEX = "^([f|F][e|E][m|M][a|A][l|L][e|E])|([m|M][a|A][l|L][e|E])|([u|U][n|N][k|K][n|N][o|O][w|W])$";
        Pattern pattern = Pattern.compile(SEX_REGEX);
        Matcher matcher = pattern.matcher(sex);
        boolean check = matcher.matches();
        if (!check){
            throw new GenderException("Input Male or Female or Unknow, please");
        }
        return check;
    }

    public String fixGender(String sex){
        sex.toLowerCase();
        String sexFirst = sex.substring(0,1).toUpperCase();
        String sexLast = sex.substring(1,sex.length());
        return sex = sexFirst+sexLast;
    }
}
