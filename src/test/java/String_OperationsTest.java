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

    // Author: Pravalika
    // Description: The below method tests the occurence of 'a' and returns the count and checks whwther the expected and actual count matches
    @Test
    public void test_StringOccurence()
    {
        assertEquals(3,StringOperation.StringOccurence("Pravalika"));
    }

    //Author:Pravalika
    // Description: This test tests the StringTrim() function
    @Test
    public void test_StringTrim()
    {
        assertEquals("madam", StringOperation.StringTrim(" madam  "));
    }

    //Author :Pravalika
    //Description: This test tests the isAnagram() method
    @Test
    public void test_isAnagram()
    {
        assertTrue(StringOperation.isAnagram("rat","tar"));
    }
}



//
