package weekonechallenge;

// Reverse "TestifyAutomation" using recursion in Java
public class Challenge7 {
    public static void main(String[] args) {
//        Challenge7 reverse = new Challenge7();
        String word = "TestifyAutomation";

        System.out.println(reverseWord(word));
    }

    public static String reverseWord(String word) {
        // Base case: if the length of the string is 0 or 1, return the string
        if (word == null || word.length() <= 1) {
            return word;
        }

        return reverseWord(word.substring(1)) + word.charAt(0);
    }
}
