package tasks;

import java.util.Scanner;

public class Task8 {
//    Build a Simple interest calculator. Write a program to ask the user
//    for the necessary field you need in calculating the simple interest
//    and then communicate the simple interest back to the user is a good
//    sentence
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, Calculate your Simple Interest Instantly.");
        System.out.println("Enter Principal Amount");

        int principal = userInput.nextInt();

        System.out.println("Enter Interest Rate in %");
        double interestRate = userInput.nextDouble();

        System.out.println("Enter Time Period");
        int time = userInput.nextInt();

        double simpleInterest = (principal * interestRate * time)/100;
        System.out.println("Your simple interest is " + simpleInterest +" for the stipulated period");
    }
}
