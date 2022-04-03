import org.junit.Assert;
import org.junit.Test;

public class ValidateUserInfoTest {
    ValidateUserInfo validateInfo = new ValidateUserInfo();

    @Test
    public void firstNameValid() throws UserRegistrationException {
        try {
            String expectedVal = "Happy";
            String actualResult = validateInfo.firstName("Sirin");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void firstNameInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validateInfo.firstName("Sirin");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validateInfo.lastName("Shaikh");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void lastNameInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validateInfo.lastName("Shaikh");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validateInfo.emailId("sirin.shaikh@sample.com");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void emailIdInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validateInfo.emailId("sirin.shaikh.co.in");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validateInfo.mobNum("54-5465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void mobNumInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validateInfo.mobNum("54-55465322154");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordValid() {
        try {
            String expectedVal = "Happy";
            String actualResult = validateInfo.password("ab98cDE@&fg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void passwordInValid() {
        try {
            String expectedVal = "Sad";
            String actualResult = validateInfo.password("ab98cDEfg");
            Assert.assertEquals(expectedVal, actualResult);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

}
