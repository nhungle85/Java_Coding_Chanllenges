import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PasswordComplexityTest {
    @Test
    public void isPasswordComplex_true() {
        assertTrue(PasswordComplexity.isPasswordComplex("Nhung@12@!"));
        assertTrue(PasswordComplexity.isPasswordComplex("Geeks@portal20"));
        assertTrue(PasswordComplexity.isPasswordComplex("JavaExpression@1!a"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(PasswordComplexity.isPasswordComplex("geeks@portal20"));
        assertFalse(PasswordComplexity.isPasswordComplex("Nhung@1"));
        assertFalse(PasswordComplexity.isPasswordComplex("Nhung 123$4"));
    }
}
