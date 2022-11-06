import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class OddOrEvenTest {
    @Test
    public void isEven_true() {
        assertTrue(OddOrEven.isEven(0));
        assertTrue(OddOrEven.isEven(2));
        assertTrue(OddOrEven.isEven(-2));
    }

    @Test
    public void isEven_false() {
        assertFalse(OddOrEven.isEven(1));
        assertFalse(OddOrEven.isEven(-1));
        assertFalse(OddOrEven.isEven(93));

    }
}
