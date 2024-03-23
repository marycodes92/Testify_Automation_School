package tasks;

public class Task14_ClassB_squareArea {
    public static void main(String[] args) {
        Task14_ClassA_SquareShape square = new Task14_ClassA_SquareShape();

        square.setShapeLength(6);
        int length = square.getShapeLength();

        square.setShapeBreadth(6);
        int breadth = square.getShapeBreadth();

        int area = length * breadth;

        System.out.println("The area of a square of length: " + length + " and breadth " + breadth + " is " + area);
    }
}
