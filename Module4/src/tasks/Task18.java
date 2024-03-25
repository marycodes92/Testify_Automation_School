package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Write a code that asks the user for age and that accepts the Integer value.
    Handle the error that is encountered when the users tries to enter a name
    instead of age
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age = 0;

        try{
            System.out.println("Please enter your age");
            age = userInput.nextInt();
        } catch (InputMismatchException exceptionError){
            System.out.println("You're expected to enter age not a name");
        }
        System.out.println("You are "+ age + " years old");
    }
}
