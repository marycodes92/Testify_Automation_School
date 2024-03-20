package tasks;

public class Task4 {
//    find the area of a circle with radius 12.7m.
//    Print out your result with the unit of measurement which is metres
    public static void main(String[] args) {
//        Formula for Area of a circle = πr^2
        double radius = 12.7;
        double pi = 3.142;
        double radiusRaisedToThePowerOfTwo = radius * radius;

        double areaOfACircle = pi * radiusRaisedToThePowerOfTwo;

        System.out.println(areaOfACircle);
    }
}
