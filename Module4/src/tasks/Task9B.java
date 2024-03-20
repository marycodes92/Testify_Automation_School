package tasks;

import java.util.Scanner;

public class Task9B {
//    Write a logic that takes in input from the user.
//    It keeps printing "try again "until the user enters "testify"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Added the question to collect the first response so that the "try again" would make sense"
        System.out.println("What is the name of my Academy?");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("testify")){
            System.out.println("Try again");
            answer = scanner.nextLine();
        }
        System.out.println("You're right, thank you");
    }
}
