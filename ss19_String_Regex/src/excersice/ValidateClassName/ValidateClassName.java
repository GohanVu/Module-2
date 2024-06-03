package excersice.ValidateClassName;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public ValidateClassName(){

    }
    public  boolean isValidClassName (String classname){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(classname);
        return matcher.matches();
    }
}
