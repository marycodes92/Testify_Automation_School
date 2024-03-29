package weekonechallenge;
/*
    Reverse the position of words in "I am the best Automation Tester" using recursion:
*/
public class Challenge2 {
    public static void main(String[] args) {
        Challenge2 reverse = new Challenge2();

        String sentence = "I am the best Automation Tester";

        reverse.reverseSentence(sentence);
    }

    public void reverseSentence(String sentence){

        int lastSpaceIndex = sentence.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            System.out.print(sentence);
        } else {
            System.out.print(sentence.substring(lastSpaceIndex + 1) + " ");

            reverseSentence(sentence.substring(0, lastSpaceIndex));
        }
    }
}
