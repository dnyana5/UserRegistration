import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.FirstNameValidate("Dnyaneshwari");
        Assert.assertTrue(result);
    }


    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.FirstNameValidate("Dn");
        Assert.assertFalse(result);			}

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.LastNameValidate("Dnyaneshwari");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.LastNameValidate("Dn");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.emailValidator("ishwarigaikwad5@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.emailValidator("abc()*@gmail.com");
        Assert.assertFalse(result);			}

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.phoneNumberValidator("919923456789");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.phoneNumberValidator("9825236");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.passwordValidator("Dnyaneshwari@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnTrue() {
        UserRegistration userValidator = new UserRegistration();
        boolean result = userValidator.passwordValidator("Dnyana@#$12");
        Assert.assertFalse(result);
    }

}
