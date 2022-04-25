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
        assertEquals(3, StringOperations.StringOccurence("Pravallika"));
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

    //Author: Rohith Tadi
    //Description: This test case is used to test the reversing string function
    @Test
    public void testreversestring(){
        assertEquals("nitin", StringOperation.reverseString("nitin"));
    }

    //Author: Rohith Tadi
    //Description: This test case is used to test the concatenation of strings function
    @Test
    public void testconcatenation(){
        assertEquals("Snow", StringOperation.StringConcatenation("Snow", "ball"));
    }
    //Author: Rohith Tadi
    //Description: This test case is used to test the length of string function
    @Test
    public void testlengthstring(){
        assertEquals("15", StringOperation.StringLength("SoftwareTesting"));
    }

    //Author :Ibrahim
    //Description: This test tests the String_Lowercase() method
    @Test
    public void test_String_Lowercase()
    {
        assertEquals("refer" , StringOperation.String_Lowercase("REFER"));
    }

    //Author :Ibrahim
    //Description: This test tests the countConsonants() method
    @Test
    public void test_countConsonants()
    {
        assertEquals(4,StringOperation.countConsonants("Ibrahim"));
    }

    //Author :Ibrahim
    //Description: This test tests the test_countVowels method
    @Test
    public void test_countVowels()
    {
        assertEquals(3,StringOperation.countVowels("Ibrahim"));
    }

    @Test
    public void RohithTest_Intergration(){ assertEquals(3, StringOperation.countConsonants(StringOperation.reverseString(StringOperation.StringTrim("level"))));
    }
}





