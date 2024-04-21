import org.example.EmailValidator;
import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.checkEmail("valid@example.com");
        Assert.assertTrue(result);
    }

    @Test
    public void secTestValidEmail() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.checkEmail("test@localhost.ua");
        Assert.assertTrue(result);
    }

    @Test
    public void secTestInvalidEmail() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.checkEmail("invalidexample.com");
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidEmail() {
        EmailValidator validator = new EmailValidator();
        boolean result = validator.checkEmail("invalid@example");
        Assert.assertFalse(result);
    }
}
