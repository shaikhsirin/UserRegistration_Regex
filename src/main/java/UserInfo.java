import java.util.Scanner;
public class UserInfo {
    Scanner sc = new Scanner(System.in);
    ValidateUserInfo validateInfo = new ValidateUserInfo();

    public void userFirstName() {
        //taking user input
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();

        //call firstName method in Validate class
        validateInfo.firstName(firstName);

    }
    public void userLastName() {
        //taking user input
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.next();

        //call firstName method in Validate class
        validateInfo.lastName(lastName);
    }
}

