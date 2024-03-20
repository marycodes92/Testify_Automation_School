package tasks;

import java.util.Arrays;

public class Task7 {
//    create a two dimensional array with 4 rows and 3 columns.
//    Fill only the first column with any fruits of ur choice
    public static void main(String[] args) {
        String [] [] fruits = new String[4][3];
        fruits [0] [0] = "Mango";
        fruits [1] [0] = "Banana";
        fruits [2] [0] = "Orange";
        fruits [3] [0] = "Grape";

        System.out.println(Arrays.deepToString(fruits));
    }
}
