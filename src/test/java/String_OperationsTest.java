import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    //Author: Rohith tadi
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreversestring(){
        assertEquals(" nitin", StringOperation.reverseString("nitin"));
    }
    //Author:Rohith tadi
    //Description: This test case is used to test the concatenation of strings function
    @Test
    public void testconcatenation(){
        assertEquals("Snow", StringOperation.StringConcatenation("Snow", "ball"));
    }
    //Author: Rohith tadi
    //Descirption: This test case is used to test the length of string function
    @Test
    public void testlengthstring(){
        assertEquals("15", StringOperation.StringLength("SoftwareTesting"));
    }


//

}

//
//





