package tasks;

public class Task5 {
//  Write a code to: If the number is divisible by 3, print Fizz instead of the number.
//  If the number is divisible by 5, print Buzz instead of the number.
//  If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.
    public static void main(String[] args) {
        byte num = 60;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(num % 3 == 0){
            System.out.println("Fizz");
        } else if(num % 5 == 0){
            System.out.println("Buzz");
        }
    }
}
