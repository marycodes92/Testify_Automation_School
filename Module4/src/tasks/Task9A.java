package tasks;

public class Task9A {
//    I have a list of numbers, 1-10, write a loop that prints odd
//    if it is an odd number and a loop that prints even if it is an even number.
    public static void main(String[] args) {
        int numbers = 10;

//        Loop that prints odd
        for( int i = 0; i <= numbers; i++){
            if(i % 2 == 1){
                System.out.println("odd");
            }
        }

//        loop that prints even
        for( int i = 0; i <= numbers; i++){
            if(i % 2 == 0){
                System.out.println("even");
            }
        }


//        loop that prints odd and even

//        for( int i = 0; i <= numbers; i++){
//            if(i % 2 == 1){
//                System.out.println(i + " is odd");
//            } else if(i % 2 == 0){
//                System.out.println(i + " is even");
//            }
//        }
    }
}
