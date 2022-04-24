import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    // Author: Pravalika
    // Description: This test tests the StringOccurence() function

    @Test
    public void test_StringOccurence() {
        assertEquals(4, StringOperations.StringOccurence("Pravallika"));
    }

    // Author: Pravalika
    // Description: This test tests the StringTrim() function

    @Test
    public void test_StringTrim() {
        assertEquals("madam", StringOperation.StringTrim("madam"));
    }

    // Author: Pravalika
    // Description: Ths test tests the Anagram() function
    @Test
    public void test_isAnagram() {
        assertTrue(StringOperation.isAnagram("rat", "tar"));
    }

}
///// ////


