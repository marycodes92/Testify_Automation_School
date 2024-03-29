package weekonechallenge;

/*
    Using  Java  Code,  check  for  Anagrams  in  these  strings:
    "Despite commuting at the peek hour, she was able to keep to time"
*/
import java.util.*;

public class Challenge6 {

    public static void main(String[] args) {
        String sentence = "Despite commuting at the peek hour, she was able to keep to time";
        Map<String, List<String>> anagrams = getAnagrams(sentence);

        for (List<String> group : anagrams.values()) {
            if (group.size() > 1) {
                System.out.println("Anagram Group: " + group);
            }
        }
    }

    // Method to find anagrams within a string
    public static Map<String, List<String>> getAnagrams(String sentence) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Iterate through each word and sort the characters of the word
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add the word to the corresponding bucket in the map
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }

        return anagramGroups;
    }
}
