import java.util.Arrays;

public class StringOperations {
    //String Operations

    // Author: Pravalika
    // Description: This method removes the extra spaces at the starting and ending of the string
    // This function is tested by Unit Test: test_StringTrim()
    public String StringTrim(String word){
        word = word.trim();
        return word;
    }

    //Author: Pravalika
    //Description: This method returns the count of occurence of a letter
    // This function is tested by Unit Test: test_StringOccurence()
    public static int StringOccurence(String word){
        char Character = 'a';
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(word.charAt(i)==Character){
                count ++;
            }
        }
    return count;
    }

    //Author: Pravalika
    //Description: This method returns the boolean value by checking whether a string is anagram or not
    // This function is tested by Unit Test:test_isAnagram()
    public boolean isAnagram(String str1, String str2){
        String s1 = str1.replaceAll("\\s","");
        String s2 = str2.replaceAll("\\s","");
        boolean flag = true;
        if(s1.length()!=s2.length()){
            flag = false;
        }
        else{
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            flag = Arrays.equals(ArrayS1,ArrayS2);
        }
        if(flag)
            return true;
        else
            return false;
    }
}
