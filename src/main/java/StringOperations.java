import java.util.Arrays;
import java.util.Locale;

public class StringOperations {
    //Author: Rohith
    //Description: This function is used to reverse the given string
    public static String reverseString(String str){
        char ch[] = str.toCharArray();
        String rev = " ";
        for(int i = ch.length-1; i >= 0; i--){
            rev+=ch[i];
        }
        return rev;


    }
    //Author: Rohith
    //Description: This function is to merge two strings
    public static String StringConcatenation(String s1, String s2){
        String s3 = s1.concat(s2);
        return s1;
    }
    //Author: Rohith
    //Author: This function is used to give length of the string
    public String StringLength(String s1){
        int length = s1.length();
        return String.valueOf(length);
    }
    //Author: Ibrahim
    //Description: This below method converts the given string to lowercase
    public String Stringlowercase(String str3){
        Stringstr4 = str3tolowecase();
        return null;
    }
    //Author: Ibrahim
    //Description: This method returns number of vowels in given string
    public int countVowels(String s1){
        int count = 0;
        char[] Char = s1.toCharArray();
        for (char chr: chars)
        {
            if (chr != 'a' && chr != 'e' && chr != 'E' && chr != 'i' && chr != 'I' && chr != 'o' && chr != 'O' && chr != 'U' && chr != 'u'){
                count = count + 1;


            }
        }
        return null;

    }
    //Author: Ibrahim
    //Description: This below method returns number of consonats in the string
    public int countConsonants(Strings2){
        int count = 0;
        char[] chars = s2.toCharArray();
        for(char chr: chars)
        {
            if (chr != 'a' && chr!= 'A' && chr!= 'e' && chr!= 'E' && chr != 'i' && chr != 'I' && chr != 'o' && chr!= 'O' && chr != 'u' && chr!= 'U') {
count = count+ 1;

        }
}
return count;
}
}




