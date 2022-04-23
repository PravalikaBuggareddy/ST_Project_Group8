import java.util.Arrays;

public class StringOperations {
// String Operation Methods

    //String Reverse
    public String StringReverse(String original) {
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        return null;
    }

    //StringConcatenation
    public static String StringConcatenation(String s1, String s2) {
        String s3 = s1.concat(s2);
        return s3;
    }

    //StringLength
    public static int StringLength(String s1) {
        int length = s1.length();
        return length;
    }

    // returns the count of occurence of a letter in a string
    public static int StringOccurence(String Word) {
        char Character = 'a';
        int count = 0;
        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) == Character) {
                count++;
            }
        }
        return count;
    }

    // removes the starting and ending spaces of a string
    public String StringTrim(String word) {
        word = word.trim();
        return word;
    }

    // method to check whether a string is anagram or not
    public boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
          return false;
        }
    }
}

