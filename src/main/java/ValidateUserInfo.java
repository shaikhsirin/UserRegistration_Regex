import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserInfo {
    public void firstName(String firstName) {
        //regex pattern
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        checkPattern(regex, firstName);
    }

    public void lastName(String lastName) {
        //regex pattern
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        checkPattern(regex, lastName);
    }

    public void emailId(String emailId) {
        //regex pattern
        String regex = "^[a-zA-z0-9]+([.][0-9a-zA-z]+)*@[a-zA-z]+.[a-z]{2,3}([.][a-z]{2,3})*$";
        checkPattern(regex, emailId);
    }

    public void mobNum(String mobNum) {
        //regex pattern
        String regex = "^[0-9]{1,3}-[0-9]{10}$";
        checkPattern(regex, mobNum);
    }

    public boolean password(String pswrd) {
        //regex pattern
        String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        return checkPattern(regex, pswrd);
    }


    //check regex pattern and input
    public boolean checkPattern(String regexPattern, String userInput) {
        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(userInput);

        //checking input is valid or not
        return matcher.matches();
    }
}



