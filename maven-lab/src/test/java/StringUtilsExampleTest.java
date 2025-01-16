import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsExampleTest {
    @Test
    public void testTrim() {
        String input = "  Hello World  ";
        assertEquals("Hello World", StringUtils.trim(input));
    }

    @Test
    public void testReverse() {
        String input = "Java";
        assertEquals("avaJ", StringUtils.reverse(input));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("text"));
    }
}
