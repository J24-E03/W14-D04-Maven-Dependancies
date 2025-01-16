import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsExampleTest {
    @Test
    void testTrim() {
        String input = "  Hello World  ";
        assertEquals("Hello World", StringUtils.trim(input));
    }

    @Test
    void testReverse() {
        String input = "Java";
        assertEquals("avaJ", StringUtils.reverse(input));
    }

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("text"));
    }
}