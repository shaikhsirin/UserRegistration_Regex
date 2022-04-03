public class RegexUserRegistration {
    public static void main(String args[]) {
        //created user info object
        UserInfo userInfo = new UserInfo();

        //calling method in UserInfo class to validate first name
        userInfo.userFirstName();
        System.out.println("==================");

        //calling method in UserInfo class to validate last name
        userInfo.userLastName();
        System.out.println("==================");

        //calling method in UserInfo class to validate email
        userInfo.userEmailId();
        System.out.println("==================");
        //calling method in UserInfo class to validate email
        userInfo.userMobNum();
        System.out.println("==================");
        //calling method in UserInfo class to validate password
        userInfo.userPassword();
        System.out.println("==================");
    }
    }
