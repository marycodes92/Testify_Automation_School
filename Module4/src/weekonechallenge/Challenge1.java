package weekonechallenge;

// Write  Java  code  to  check  if  racecar  and  10801  is  a palindromes.

public class Challenge1 {
    public static void main(String[] args) {
        Challenge1 wordCheck = new Challenge1();

        System.out.println(wordCheck.palindrome("racecar"));
        System.out.println(wordCheck.palindrome("10801"));

    }

    public StringBuilder palindrome( String word){
        StringBuilder eachChar = new StringBuilder();
        StringBuilder newWord = new StringBuilder();

        StringBuilder message;

        for(int i = word.length()-1; i >= 0; i--){
            newWord = eachChar.append(word.charAt(i));
        }

        if(newWord.toString().equals(word)){
            message = new StringBuilder(word + " is a Palindrome");
        } else {
            message = new StringBuilder(word + " is not a palindrome");
        }
        return message;
    }
}
