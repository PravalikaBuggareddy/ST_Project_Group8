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



}


//
//