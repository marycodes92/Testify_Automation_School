package weekonechallenge;

// Write  a  Java code  to  check  for  the Prime  numbers between 1-100
public class Challenge4 {
    public static void main(String[] args) {

        System.out.println("These are prime numbers between 1 - 100: ");

        for(int i = 1; i<= 100; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
