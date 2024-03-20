package tasks;

public class Task6 {
//    Write a code to reverse the string DEMOCRACY and get the word COME out of it.
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        StringBuilder eachChar = new StringBuilder();
        StringBuilder reversedWord = new StringBuilder();

        for (int i = word.length()-1; i>= 0; i --){
            reversedWord = eachChar.append(word.charAt(i));
        }

        System.out.println(reversedWord.substring(4, 8));
    }
}
