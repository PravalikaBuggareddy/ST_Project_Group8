import java.util.Arrays;


public class StringOperations {
    //Author: Rohith
    //Description: This function is used to reverse the given string
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = " ";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;


    }

    //Author: Rohith
    //Description: This function is to merge two strings
    public static String StringConcatenation(String s1, String s2) {
        String s3 = s1.concat(s2);
        return s1;
    }

    //Author: Rohith
    //Author: This function is used to give length of the string
    public String StringLength(String s1) {
        int length = s1.length();
        return String.valueOf(length);
    }

    // Author :Ibrahim
    // Description : The below method returns the number of vowels in the string
    //  This function is tested by Unit Test : test_countVowels()
    public int String_countvowels(String S1){

        int count = 0;

        char[] Chars = S1.toCharArray();

        for (char chr : Chars)
        {
            if (chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E' || chr == 'i' || chr == 'I' || chr == 'o' || chr == 'O' || chr == 'u' || chr == 'U')
            {
                count = count + 1;
            }
        }
        return count;
    }

    // Author :Ibrahim
    // Description : The below method returns the number of consonants in the string
    //  This function is tested by Unit Test : test_countConsonants()
    public static String countConsonants(String S2)
    {
        int count = 0;

        char[] Chars = S2.toCharArray();

        for ( char chr: Chars)
        {
            if (chr != 'a' && chr != 'A' && chr != 'e' && chr != 'E' && chr != 'i' && chr != 'I' && chr != 'o' && chr != 'O' && chr != 'u' && chr != 'U')
            {
                count = count + 1;
            }
        }
        return String.valueOf(count);
    }


    // Author :Ibrahim
    // Description : The below method returns the number of lowercase in the string
    //  This function is tested by Unit Test : test_StringLowercase()
    public String String_Lowercase(String Str3) {
        String Str4 = Str3.toLowerCase();
        return Str4;
    }
}


