import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    //Author: Pravalika
    //Description: This test tests the StringTrim() method

    @Test
    public void test_StringTrim(){
        assertEquals("madam", StringOperation.StringTrim("  madam "));
    }

    //Author: Pravalika
    //Description: This test tests the StringOccurence() function

    @Test
    public void test_StringOccurence(){
        assertEquals(3,StringOperation.StringOccurence("Pravalika"));
    }

    //Author: Pravalika
    //Description: The test tests the Anagram() function
    @Test
    public void test_isAnagram(){
        assertTrue(StringOperation.isAnagram("rat","tar"));
    }

}





