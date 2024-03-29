package weekonechallenge;

import java.util.*;

// Create anagram buckets from a given input array of words:input is {"akka", "akak", "baab", "baba", "bbaa"}
public class Challenge5 {

    public static void main(String[] args) {
        String[] inputWords = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = createAnagramBuckets(inputWords);

        // Print the anagram buckets
        for (List<String> bucket : anagramBuckets.values()) {
            System.out.println("Anagram Bucket: " + bucket);
        }
    }
    public static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramBuckets = new HashMap<>();

        // Iterating through each word in the array
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Adding the word to the corresponding bucket in the map
            if (!anagramBuckets.containsKey(sortedWord)) {
                anagramBuckets.put(sortedWord, new ArrayList<>());
            }
            anagramBuckets.get(sortedWord).add(word);
        }

        return anagramBuckets;
    }
}
