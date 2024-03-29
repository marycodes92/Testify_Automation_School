package weekonechallenge;

import java.util.Arrays;

// Given a collection of 1 million integers, all ranging between 1 to 9, sort them in Big O(n) time
public class Challenge8 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 5, 6, 4, 7, 8, 9, 5, 3, 1, 2, 7, 8, 9, 6, 8, 6, 4, 7, 8, 9, 5, 3, 1, 2, 7, 8};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int[] count = new int[10]; //assuming the integers are in the range 1 to 9

        // Count the frequency of each integer
        for (int num : arr) {
            count[num]++;
        }

        // Populate the sorted array using the count array
        int index = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}

