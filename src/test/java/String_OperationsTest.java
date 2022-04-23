import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup()
    {
        StringOperation = new StringOperations();
    }

    // Test case by Pravalika
    @Test
    public void test_Palindrome()
    {
        assertEquals("nitin",StringOperation.ReverseString("nitin"));
    }

    @Test
    public void test_Concatenation()
    {
       assertEquals("Snowball",StringOperation.StringConcatenation("Snow","ball"));
    }

    @Test
    public void test_StringLength()
    {
        assertEquals(15,StringOperation.StringLength("SoftwareTesting"));
    }

    @Test
    public void test_StringOccurence()
    {
        assertEquals(2, StringOperation.StringOccurence("madam"));
    }

    @Test
    public void test_StringTrim()
    {
        assertEquals("madam", StringOperation.StringTrim(" madam "));
    }
}


